package io.dynamic_softworks.icost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityListaUsuarios extends AppCompatActivity {
  
  private LinearLayout listaUsuarios;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lista_usuarios);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    listaUsuarios = (LinearLayout) findViewById(R.id.layout_lista_usuarios);
  
    Button botonAgregarUsuario = (Button) findViewById(R.id.lista_usuarios_boton_nuevo_usuario);
    if (botonAgregarUsuario != null){
      botonAgregarUsuario.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          agregarUsuario();
        }
      });
    }
  }
  
  private void agregarUsuario(){
    Intent intent = new Intent(this, ActivityNuevoUsuario.class);
    startActivity(intent);
  }
  
}
