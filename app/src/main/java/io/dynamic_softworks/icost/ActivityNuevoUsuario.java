package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActivityNuevoUsuario extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_usuario);
    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
    
    
  }
  
  public void registrar(View v){
    
  }
  
  public void cancelar(View v){
    finish();
  }
}
