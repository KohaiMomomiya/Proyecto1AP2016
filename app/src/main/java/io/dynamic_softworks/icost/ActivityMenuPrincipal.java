package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActivityMenuPrincipal extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu_principal);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  
    
    Button botonVerListaProyectos = (Button) findViewById(R.id.boton_ver_lista_proyectos);
    if (botonVerListaProyectos != null){
      botonVerListaProyectos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          verListaProyectos();
        }
      });
    }
  
  
    Button botonVerListaUsuarios = (Button) findViewById(R.id.boton_ver_lista_usuarios);
    if (botonVerListaUsuarios != null){
      botonVerListaUsuarios.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          verListaUsuarios();
        }
      });
    }
  }
  
  
  private void verListaProyectos(){
    Intent intent = new Intent(this, ActivityListaProyectosUsuario.class);
    startActivity(intent);
  }
  
  private void verListaUsuarios(){
    Intent intent = new Intent(this, ActivityListaUsuarios.class);
    startActivity(intent);
  }
}
