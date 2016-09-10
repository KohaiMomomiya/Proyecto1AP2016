package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityInfoRelease extends AppCompatActivity {
  
  private TextView tvNombreRelease;
  private LinearLayout listaSprints;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_info_release);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    tvNombreRelease = (TextView) findViewById(R.id.info_release_nombre);
    listaSprints = (LinearLayout) findViewById(R.id.layout_lista_sprints);
  
    Button botonAgregarSprint = (Button) findViewById(R.id.boton_agregar_nuevo_sprint);
    if (botonAgregarSprint != null){
      botonAgregarSprint.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          agregarSprint();
        }
      });
    }
    
  }
  
  
  private void agregarSprint(){
    Intent intent = new Intent(this, ActivityNuevoSprint.class);
    startActivity(intent);
  }
  
}
