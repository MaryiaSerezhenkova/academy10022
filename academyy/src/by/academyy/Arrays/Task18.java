package by.academyy.Arrays;

import java.util.Arrays;
import java.util.Collections;
 
//Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок
 
//с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них
//не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров
//из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
//При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать
//повторяющимися).
 
public class Task18 {
 
    public static void main(String[] args) {
 
        
                String[] tasksArray = tasksArray();
                for (int i = 0; i < 15; i++) {
                    System.out.println(tasksArray[i]);
                }
            }
 
            public static String[] tasksArray() {
                String[] tasksArray = new String[36];
                int n = 0;
                for (int i = 2; i <= 9; i++) {
                    for (int j = i; j <= 9; j++) {
                        tasksArray[n] = i + " * " + j + " = ?";
                        n++;
                    }
                }
 
                Collections.shuffle(Arrays.asList(tasksArray));
                return tasksArray;
            }
        }
 
