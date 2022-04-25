package by.academyy.RegEx;

//Имеется строка с текстом. Вывести текст, составленный из последних
//букв всех слов

public class Task3 {
   public static void main(String[] args) {
          String text = "Hey There! How Are you doing";
          
          text = text.replaceAll("[!.,:;-]", "");
          
          String[] words = text.split(" ");
          StringBuilder newText = new StringBuilder();
          
  
   for(String word : words) {
       newText.append(word.charAt(word.length()-1));
   }
   
   System.out.println(newText);
}
}
