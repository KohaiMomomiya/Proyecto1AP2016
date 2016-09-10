package io.dynamic_softworks.icost;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class ActivityNuevoProyecto extends AppCompatActivity{
  
  private int sprintDuration;
  
  private ViewFlipper viewFlipper;
  
  private EditText etNombreProyecto;
  private EditText etDuracionSprint;
  private EditText etDescripcion;
  
  private Spinner spinnerProductOwner;
  private Spinner spinnerScrumMaster;
  
  private LinearLayout layoutSeleccionDevelopers;
  private LinearLayout layoutSeleccionTesters;
  
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_proyecto);

    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
  
    viewFlipper = (ViewFlipper) findViewById(R.id.new_project_viewflipper);
    
    etNombreProyecto = (EditText) findViewById(R.id.nombre_nuevo_proyecto);
    etNombreProyecto = (EditText) findViewById(R.id.descripcion_nuevo_proyecto);
    etDuracionSprint = (EditText) findViewById(R.id.duracion_sprint_nuevo_proyecto);
    
    sprintDuration = 4;
    
    spinnerProductOwner = (Spinner) findViewById(R.id.new_project_product_owner_spinner);
    spinnerScrumMaster = (Spinner) findViewById(R.id.new_project_scrum_master_spinner);
    
    layoutSeleccionDevelopers = (LinearLayout) findViewById(R.id.new_project_developers_selection);
    layoutSeleccionTesters = (LinearLayout) findViewById(R.id.new_project_testers_selector);
    
    Button botonRegistrarNuevoProyecto = (Button) findViewById(R.id.boton_registrar_nuevo_proyecto);
    if (botonRegistrarNuevoProyecto != null){
      botonRegistrarNuevoProyecto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrar();
        }
      });
    }
    
    Button botonCancelarNuevoProyecto = (Button) findViewById(R.id.boton_cancelar_nuevo_proyecto);
    if (botonCancelarNuevoProyecto != null){
      botonCancelarNuevoProyecto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
    
    Button botonAtrasProyecto = (Button) findViewById(R.id.boton_atras_nuevo_proyecto);
    if (botonAtrasProyecto != null){
      botonAtrasProyecto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          irHaciaPantallaAnterior();
        }
      });
    }
    
    Button botonAdelanteProyecto = (Button) findViewById(R.id.boton_adelante_nuevo_proyecto);
    if (botonAdelanteProyecto != null){
      botonAdelanteProyecto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          irHaciaProximaPantalla();
        }
      });
    }
  }
  
  
  @Override
  public void onBackPressed(){
    int currentStep = viewFlipper.getDisplayedChild();
    if (currentStep > 0){
      irHaciaPantallaAnterior();
    } else {
      finish();
    }
  }
  
  private void irHaciaPantallaAnterior(){
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
  
  private void irHaciaProximaPantalla() {
    View view = this.getCurrentFocus();
    if (view != null) {
      InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
      imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
  
  
    if (viewFlipper.getDisplayedChild() <= viewFlipper.getChildCount() - 1) {
      viewFlipper.setInAnimation(this, R.anim.slide_in_from_right);
      viewFlipper.setOutAnimation(this, R.anim.slide_out_to_left);
      viewFlipper.showNext();
    }
  }
  
  private void registrar(){
    // TODO Validación datos.
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.newProject_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.submitting_new_project,
          Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
