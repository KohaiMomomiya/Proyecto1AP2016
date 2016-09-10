package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityNuevoUserStory extends AppCompatActivity {
  
  private EditText etNombre;
  private EditText etPrioridad;
  private EditText etPuntaje;
  
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_user_story);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    etNombre = (EditText) findViewById(R.id.nombre_nuevo_user_story);
    etPrioridad = (EditText) findViewById(R.id.prioridad_nuevo_user_story);
    etPuntaje = (EditText) findViewById(R.id.puntaje_nuevo_user_story);
  
  
    Button registrarUserStory = (Button) findViewById(R.id.boton_registrar_nuevo_user_story);
    if (registrarUserStory != null){
      registrarUserStory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrar();
        }
      });
    }
    
    Button cancelarUserStory = (Button) findViewById(R.id.boton_cancelar_nuevo_userstory);
    if (cancelarUserStory != null){
      cancelarUserStory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
  }
  
  private void registrar(){
    // TODO Validación datos.
    CoordinatorLayout layout =
        (CoordinatorLayout) findViewById(R.id.nuevo_user_story_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.submitting_new_user_story,
          Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
