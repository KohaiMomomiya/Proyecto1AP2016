package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityCambiarUserStoriesSprint extends AppCompatActivity {
  
  private LinearLayout listaUserStoriesEntrantes;
  private LinearLayout listaUserStoriesSalientes;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cambiar_user_stories_sprint);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    listaUserStoriesEntrantes =
        (LinearLayout) findViewById(R.id.cambio_sprint_lista_user_stories_entrantes);
    listaUserStoriesSalientes =
        (LinearLayout) findViewById(R.id.cambio_sprint_lista_user_stories_salientes);
    
    Button botonActualizarSprint = (Button) findViewById(R.id.boton_actualizar_sprint);
    if (botonActualizarSprint != null) {
      botonActualizarSprint.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrarCambios();
        }
      });
    }
  
    Button botonCancelarCambios = (Button) findViewById(R.id.boton_cancelar_cambios_sprint);
    if (botonCancelarCambios != null) {
      botonCancelarCambios.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
  
  }
  
  private void registrarCambios(){
    // TODO Validación datos.
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.cambio_sprint_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.updating_sprint_user_stories, Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
