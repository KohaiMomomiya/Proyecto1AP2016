package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class ActivityNuevoSprint extends AppCompatActivity {
  
  private EditText etNombreSprint;
  private LinearLayout listaUserStoriesEntrantes;
  private LinearLayout listaUserStoriesSalientes;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_sprint);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    etNombreSprint = (EditText) findViewById(R.id.nombre_nuevo_sprint);
   
    listaUserStoriesEntrantes =
        (LinearLayout) findViewById(R.id.nuevo_sprint_lista_user_stories_entrantes);
    listaUserStoriesSalientes =
        (LinearLayout) findViewById(R.id.nuevo_sprint_lista_user_stories_salientes);
  
    Button registrarNuevoSprint = (Button) findViewById(R.id.boton_registar_nuevo_sprint);
    if (registrarNuevoSprint != null){
      registrarNuevoSprint.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrar();
        }
      });
    }
    
    Button cancelarNuevoSprint = (Button) findViewById(R.id.boton_cancelar_nuevo_sprint);
    if (cancelarNuevoSprint != null){
      cancelarNuevoSprint.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
  }
  
  
  private void registrar(){
    // TODO Validación datos.
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.nuevo_sprint_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.submitting_new_sprint,
          Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
