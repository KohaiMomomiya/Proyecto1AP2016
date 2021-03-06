package io.dynamic_softworks.icost.conectividad;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Esteban on 6/9/2016.
 */

public class AccesoWeb extends AsyncTask<Void, Void, String> {
  private String dbUrl;
  private Context context;
  
  public AccesoWeb(Context context, String url){
    this.context = context;
    this.dbUrl = dbUrl;
  }
  
  
  @Override
  protected String doInBackground(Void... params) {
    try {
      URL url = new URL(dbUrl);
      HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
  
      InputStream inputStream = httpURLConnection.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      
      StringBuilder stringBuilder = new StringBuilder();
      String JSON_String;
      
      while ((JSON_String = bufferedReader.readLine()) != null) {
        stringBuilder.append(JSON_String);
        stringBuilder.append("\n");
      }
      
      bufferedReader.close();
      inputStream.close();
      httpURLConnection.disconnect();
      
      return stringBuilder.toString().trim();
      
    } catch (MalformedURLException e) {
      Log.e("AccesoWeb", "MalformedURLException");
      e.printStackTrace();
    } catch (IOException e) {
      Log.e("AccesoWeb", "IOException");
      e.printStackTrace();
    }
    
    return "";
  }
  
  @Override
  protected void onPostExecute(String result){
    super.onPostExecute(result);
  }
}
