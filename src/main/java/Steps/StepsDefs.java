package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

import java.util.HashMap;

public class StepsDefs {
  static HashMap<String, Integer> storage = new HashMap<String, Integer>();

    @Тогда("у меня есть {int} огурца")
    static void getMyCukes(int num){
    System.out.println("У меня " + num + " огурца");
    storage.put("Мои огурцы", num);
  }
    @Тогда("у тебя {int} огурца")
  public  static void getYourCukes(int num){
    System.out.println("He has " + num + " cucumbers");
    storage.put("Твои огурцы", num);
  }
    @Тогда("сосчитать сколько у нас огурцов")
  public  static void countCukes(){
    System.out.println("У нас " + (storage.get("Мои огурцы") + storage.get("Твои огурцы")) + " cucumbers");

  }

}
