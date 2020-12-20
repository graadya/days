package Steps;

import io.cucumber.java.Before;

import java.sql.SQLOutput;

public class Hooks {

  @Before
  public static void before(){
    System.out.println("Hello world");
  }
}
