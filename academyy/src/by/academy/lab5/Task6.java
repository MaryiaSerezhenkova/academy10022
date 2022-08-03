package by.academy.lab5;
//Приложение, выводящее фамилию разработчика и за сколько дней готов выполнить задание.
//Необходимо рассчитать дату и время сдачи задания. Для получения даты и времени использовать классы из пакета java.time.
 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
 
public class Task6 {
    public static LocalDate today = LocalDate.now();
    public static LocalTime time = LocalTime.now();
    
    public static void main(String[] args) {
        Developer d1 = new Developer("Ann Smith", 30);
        Developer d2 = new Developer("Bob Jons", 10);
        getDateOfAssignment(d1);
        getDateOfAssignment(d2);
 
    }
    public static void getDateOfAssignment(Developer d) {
        LocalDate day = today.plusDays(d.getDaysOfwork());
        LocalTime t = time.plusHours(d.getDaysOfwork()*24);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");
        LocalDateTime finish = LocalDateTime.of(day, t);
        System.out.println("Срок сдачи задания: "+d.getName()+" "+finish.format(formatter));
    }
}
 
 