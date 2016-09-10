package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityNuevaTarea extends AppCompatActivity {
  
  private EditText etNombreTarea;
  private EditText etHorasEsfuerzoTarea;
  
  private Button registrarNuevaTarea;
  private Button cancelarNuevaTarea;
  
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nueva_tarea);
    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
    
    etNombreTarea = (EditText) findViewById(R.id.nombre_nueva_tarea);
    etHorasEsfuerzoTarea = (EditText) findViewById(R.id.horas_esfuerzo_nueva_tarea);
    
    registrarNuevaTarea = (Button) findViewById(R.id.boton_registrar_nueva_tarea);
    if (registrarNuevaTarea != null){
      registrarNuevaTarea.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrar();
        }
      });
    }
    
    cancelarNuevaTarea = (Button) findViewById(R.id.boton_cancelar_nueva_tarea);
    if (cancelarNuevaTarea != null){
      registrarNuevaTarea.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
  }
  
  
  private void registrar(){
    // TODO Validación datos.
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.nueva_tarea_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.submitting_new_task,
          Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
