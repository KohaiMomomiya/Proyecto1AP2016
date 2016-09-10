package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityListaUsuariosProyecto extends AppCompatActivity {
  
  private TextView tvProductOwner;
  private TextView tvScrumMaster;
  
  private LinearLayout layoutListaDevelopers;
  private LinearLayout layoutListaTesters;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lista_usuarios_proyecto);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    tvProductOwner = (TextView) findViewById(R.id.product_owner_proyecto);
    tvScrumMaster = (TextView) findViewById(R.id.scrum_master_proyecto);
    
    layoutListaDevelopers = (LinearLayout) findViewById(R.id.lista_developers_proyecto);
    layoutListaTesters = (LinearLayout) findViewById(R.id.lista_testers_proyecto);
    
  }
  
}
