package by.academyy.RegEx;

//Дана строка:
//" Hey      There!     How      Are you doing"   ;
//оставить лишь 1 пробел между слов.
public class Task5 {

  public static void main(String[] args) {
  String text = " Hey      There!     How      Are you doing";
  
  text = text.replaceAll("\\s+", " ");
  System.out.println(text.trim());
}
}
