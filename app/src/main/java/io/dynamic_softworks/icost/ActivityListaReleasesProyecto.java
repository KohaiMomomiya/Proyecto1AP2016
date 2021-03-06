package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityListaReleasesProyecto extends AppCompatActivity {
  
  private LinearLayout listaReleases;
  
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lista_releases_proyecto);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    listaReleases = (LinearLayout) findViewById(R.id.layout_lista_releases_proyecto);
    
    Button botonAgregarRelease = (Button) findViewById(R.id.boton_agregar_nuevo_release);
    if (botonAgregarRelease != null){
      botonAgregarRelease.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          agregarNuevoRelease();
        }
      });
    }
    
  }
  
  
  private void agregarNuevoRelease(){
    Intent intent = new Intent(this, ActivityNuevoRelease.class);
    startActivity(intent);
  }
}
