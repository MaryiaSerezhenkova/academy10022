package by.academyy.Strings;
import java.util.Arrays;
import java.util.HashMap;
 
//Напишите программу на Java, чтобы найти повторяющиеся символы в строке
 
public class HW5a {
    public static void main(String... args) {
        String str = "Напишите программу на Java, чтобы найти повторяющиеся символы в строке";
        char[] symb = str.toCharArray();
        HashMap<Character, Integer> hp = new HashMap<>();
        for (int i = 0; i < symb.length; i++) {
            if (hp.containsKey(symb[i])) {
                hp.put(symb[i], hp.get(symb[i]) + 1);
            } else {
                hp.put(symb[i], 1);
            }
        }
        System.out.println(hp);
        for (Character key : hp.keySet()) {
            if (hp.get(key) > 1) {
                System.out.println(key + " : " + hp.get(key));
            }
        }
    }
}
 