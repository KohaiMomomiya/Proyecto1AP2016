package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityInfoUserStory extends AppCompatActivity {
  
  private TextView tvNombreUserSprint;
  private TextView tvPrioridad;
  private TextView tvPuntuacion;

  private LinearLayout listaTareas;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_info_user_story);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    tvNombreUserSprint = (TextView) findViewById(R.id.info_user_story_nombre);
    tvPrioridad = (TextView) findViewById(R.id.info_user_story_prioridad);
    tvPuntuacion = (TextView) findViewById(R.id.info_user_story_puntuacion);
    
    listaTareas = (LinearLayout) findViewById(R.id.info_user_story_lista_tareas);
  
    Button botonAgregarTarea = (Button) findViewById(R.id.info_user_story_boton_agregar_tarea);
    if (botonAgregarTarea != null){
      botonAgregarTarea.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          agregarTarea();
        }
      });
    }
  }
  
  private void agregarTarea(){
    Intent intent = new Intent(this, ActivityNuevaTarea.class);
    startActivity(intent);
  }
  
}
