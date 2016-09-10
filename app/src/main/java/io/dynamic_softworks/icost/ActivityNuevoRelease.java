package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityNuevoRelease extends AppCompatActivity {
  
  private EditText nombreRelease;
  
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_release);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    nombreRelease = (EditText) findViewById(R.id.nombre_nuevo_release);
  
    Button registrarNuevoRelease = (Button) findViewById(R.id.boton_registrar_nuevo_release);
    if (registrarNuevoRelease != null){
      registrarNuevoRelease.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrar();
        }
      });
    }
    
    Button cancelarNuevoRelease = (Button) findViewById(R.id.boton_cancelar_nuevo_release);
    if (cancelarNuevoRelease != null){
      cancelarNuevoRelease.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
  }
  
  private void registrar(){
    // TODO Validación datos.
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.nuevo_release_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.submitting_new_release,
          Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
