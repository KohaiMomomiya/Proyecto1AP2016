package io.dynamic_softworks.icost;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Esteban on 8/9/2016.
 */
public class Validaciones {
  
  static final Pattern REGEX_EMAIL =
      Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,63}\\b", Pattern.CASE_INSENSITIVE);
  static final Pattern REGEX_PASSWORD =
      Pattern.compile("\\b[A-Z0-9]{4,}\\b", Pattern.CASE_INSENSITIVE);
  
  
  public static boolean validarEmail(String email){
    Matcher verificador = REGEX_EMAIL.matcher(email);
    return verificador.find();
  }
  
  public static boolean validarPassword(String password){
    Matcher verificador = REGEX_PASSWORD.matcher(password);
    return verificador.find();
  }
}
