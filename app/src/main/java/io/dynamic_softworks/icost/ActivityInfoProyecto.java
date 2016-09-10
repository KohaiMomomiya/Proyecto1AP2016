package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityInfoProyecto extends AppCompatActivity {
  
  private TextView tvNombreProyecto;
  private TextView tvDuracionSprints;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_info_proyecto);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    tvNombreProyecto = (TextView) findViewById(R.id.info_proyecto_nombre);
    tvDuracionSprints = (TextView) findViewById(R.id.info_proyecto_duracion_sprint);
  
    Button botonEquipoProyecto = (Button) findViewById(R.id.info_proyecto_boton_ver_usuarios);
    if (botonEquipoProyecto != null){
      botonEquipoProyecto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          verUsuariosEnProyecto();
        }
      });
    }
    
    Button botonUserStories = (Button) findViewById(R.id.info_proyecto_boton_ver_user_stories);
    if (botonUserStories != null){
      botonUserStories.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          verUserStories();
        }
      });
    }
    
    Button botonReleases = (Button) findViewById(R.id.info_proyecto_boton_ver_releases);
    if (botonReleases != null){
      botonReleases.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          verReleases();
        }
      });
    }
  }
  
  
  private void verUsuariosEnProyecto(){
    Intent intent = new Intent(this, ActivityListaUsuariosProyecto.class);
    startActivity(intent);
  }
  
  private void verUserStories(){
    Intent intent = new Intent(this, ActivityListaUserStoriesProyecto.class);
    startActivity(intent);
  }
  
  private void verReleases(){
    Intent intent = new Intent(this, ActivityListaReleasesProyecto.class);
    startActivity(intent);
  }
}
