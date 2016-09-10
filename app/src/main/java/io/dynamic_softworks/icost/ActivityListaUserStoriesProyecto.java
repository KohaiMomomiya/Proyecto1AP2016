package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityListaUserStoriesProyecto extends AppCompatActivity {
  
  private LinearLayout listaUserStories;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lista_user_stories_proyecto);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    
    listaUserStories = (LinearLayout) findViewById(R.id.layout_lista_user_stories);
  
    Button botonAgregarUserStory = (Button) findViewById(R.id.boton_agregar_userstory);
    if (botonAgregarUserStory != null){
      botonAgregarUserStory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          agregarNuevoUserStory();
        }
      });
    }
    
  }
  
  
  private void agregarNuevoUserStory(){
    Intent intent = new Intent(this, ActivityNuevoUserStory.class);
    startActivity(intent);
  }
}
