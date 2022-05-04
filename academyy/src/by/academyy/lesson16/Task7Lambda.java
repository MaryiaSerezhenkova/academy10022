package by.academyy.lesson16;
//7.    Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
//“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
import java.util.function.Function;

public class Task7Lambda {

  public static void main(String[] args) {

          Function<Integer, String> function = d -> {
              
              String result = "";
              if (d>0) {
                  result = "Положительное число";
              }
              else if (d<0) {
                  result ="Отрицательное число";
          }
              else if (d==0) {
                  result ="Ноль";
              }
              return result;
          };

              
          System.out.println(function.apply(5));
          System.out.println(function.apply(-5));
          System.out.println(function.apply(0));
      
  }

}
