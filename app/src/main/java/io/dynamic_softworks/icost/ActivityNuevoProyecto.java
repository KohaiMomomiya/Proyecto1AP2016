package io.dynamic_softworks.icost;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class ActivityNuevoProyecto extends AppCompatActivity{
  
  int sprintDuration;
  
  ViewFlipper viewFlipper;
  EditText etSprintDuration;
  
  Spinner productOwnerSpinner;
  Spinner scrumMasterSpinner;
  
  LinearLayout developersSelection;
  LinearLayout testersSelection;
  
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_proyecto);

    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
    
    sprintDuration = 4;
    
    etSprintDuration = (EditText) findViewById(R.id.newProject_sprintDuration);
    viewFlipper = (ViewFlipper) findViewById(R.id.new_project_viewflipper);
  }
  
  
  @Override
  public void onBackPressed(){
    int currentStep = viewFlipper.getDisplayedChild();
    if (currentStep > 0){
      previousStep();
    } else {
      super.onBackPressed();
    }
  }
  

  
  private void previousStep(){
    View view = this.getCurrentFocus();
    if (view != null) {
      InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
      imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    
    
    if (viewFlipper.getDisplayedChild() > 0){
      viewFlipper.setInAnimation(this, R.anim.slide_in_from_left);
      viewFlipper.setOutAnimation(this, R.anim.slide_out_to_right);
      viewFlipper.showPrevious();
    }
  }
  
  private void nextStep(){
    View view = this.getCurrentFocus();
    if (view != null) {
      InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
      imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    
    
    if (viewFlipper.getDisplayedChild() <= viewFlipper.getChildCount() - 1) {
      viewFlipper.setInAnimation(this, R.anim.slide_in_from_right);
      viewFlipper.setOutAnimation(this, R.anim.slide_out_to_left);
      viewFlipper.showNext();
    }
  }
  
  
  public void nextButton(View view){
    nextStep();
  }
  
  public void prevButton(View view){
    previousStep();
  }
  
  public void submitProject(View view){
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.newProject_activity_layout);
    if (layout != null){
      Snackbar.make(layout, "Submitting new project...",
          Snackbar.LENGTH_SHORT).show();
    }
  }
}
