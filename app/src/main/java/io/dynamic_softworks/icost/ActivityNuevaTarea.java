package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ActivityNuevaTarea extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nueva_tarea);
    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
    
  }
  
}
