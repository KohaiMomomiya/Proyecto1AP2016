package io.dynamic_softworks.icost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class RegisterNewUser extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register_new_user);
    Toolbar toolbar = (Toolbar) findViewById(R.id.new_project_toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setTitle("Register New User");
    
    
  }
  
}
