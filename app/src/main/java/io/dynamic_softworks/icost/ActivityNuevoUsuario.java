package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivityNuevoUsuario extends AppCompatActivity {
  
  private EditText etNombre;
  private EditText etEmail;
  private EditText etPassword;
  private EditText etPassword2;
  private CheckBox cbSysAdmin;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nuevo_usuario);
    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
    
    etNombre = (EditText) findViewById(R.id.nombre_nuevo_usuario);
    etEmail = (EditText) findViewById(R.id.email_nuevo_usuario);
    etPassword = (EditText) findViewById(R.id.password_nuevo_usuario);
    etPassword2 = (EditText) findViewById(R.id.password2_nuevo_usuario);
    cbSysAdmin = (CheckBox) findViewById(R.id.checkbox_nuevo_usuario_sysadmin);
  
    Button registrarNuevoUsuario = (Button) findViewById(R.id.boton_registrar_nuevo_usuario);
    if (registrarNuevoUsuario != null){
      registrarNuevoUsuario.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          registrar();
        }
      });
    }
    
    Button cancelarNuevoUsuario = (Button) findViewById(R.id.boton_cancelar_nuevo_usuario);
    if (cancelarNuevoUsuario != null){
      cancelarNuevoUsuario.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          cancelar();
        }
      });
    }
    
  }
  
  private void registrar(){
    // TODO Validación datos.
    CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.nuevo_usuario_activity_layout);
    if (layout != null){
      Snackbar.make(layout, R.string.submitting_new_user, Snackbar.LENGTH_SHORT).show();
    }
  }
  
  private void cancelar(){
    finish();
  }
}
