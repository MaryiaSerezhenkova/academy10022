package by.academyy.homework2;

public class Task3 {
	//Условие здачи: ввести 2 слова, состоящие из четного числа букв. 
	//Получить слово состоящее из первой половины первого слова и второй половины второго слова.


public static void main(String... args) {

String str1 = "ВОДА";
String str2 = "ПОЛК";
String str3 = (str1.substring(0, str1.length()/2)) + (str2.substring(str2.length()/2, str2.length()));

        System.out.println(str3);

    }



}
