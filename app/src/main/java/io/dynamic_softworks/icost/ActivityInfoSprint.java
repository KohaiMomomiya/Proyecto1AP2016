package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityInfoSprint extends AppCompatActivity {
  
  private TextView tvNombreSprint;
  private TextView tvDuracionSprint;
  
  private LinearLayout listaUserStoriesEntrantes;
  private LinearLayout listaUserStoriesSalientes;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_info_sprint);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    
    tvNombreSprint = (TextView) findViewById(R.id.info_sprint_nombre);
    tvDuracionSprint = (TextView) findViewById(R.id.info_sprint_duracion);
    
    listaUserStoriesEntrantes =
        (LinearLayout) findViewById(R.id.lista_users_stories_entrantes_sprint);
    listaUserStoriesSalientes =
        (LinearLayout) findViewById(R.id.lista_users_stories_salientes_sprint);
  
    Button botonEditarSprintsAsociados =
        (Button) findViewById(R.id.info_sprint_boton_editar_userstories);
    if (botonEditarSprintsAsociados != null){
      botonEditarSprintsAsociados.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          editarSprintsAsociados();
        }
      });
    }
    
  }
  
  
  private void editarSprintsAsociados(){
    
  }
}
