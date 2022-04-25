package by.academyy.RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
//1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество
 
public class Task1 {
    public static void main(String[] args) {
        String s = "Найти в строке не только запятые , но и другие знаки препинания.!?";
        Pattern znakiPattern = Pattern.compile("[\\p{P}\\p{S}]");
        Matcher matcherZnaki = znakiPattern.matcher(s);
        List<String> znaki = new ArrayList<>();
        while (matcherZnaki.find()){
            znaki.add(matcherZnaki.group(0));
        }
        System.out.println(znaki);
        System.out.println("Кол-во пунктуационных символов: " + Integer.toString(znaki.size()));
}
}
