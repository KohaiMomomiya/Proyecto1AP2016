package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityListaProyectosUsuario extends AppCompatActivity {
  
  private LinearLayout layoutListaProyectos;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lista_proyectos_usuario);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    layoutListaProyectos = (LinearLayout) findViewById(R.id.layout_lista_proyectos);
    
    Button botonAgregarProyecto = (Button) findViewById(R.id.boton_agregar_nuevo_proyecto);
    if (botonAgregarProyecto != null){
      botonAgregarProyecto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          agregarProyecto();
        }
      });
    }
  }
  
  @Override
  public void onBackPressed(){
    finish();
  }
  
  private void agregarProyecto(){
    Intent intent = new Intent(this, ActivityNuevoProyecto.class);
    startActivity(intent);
  }
}
