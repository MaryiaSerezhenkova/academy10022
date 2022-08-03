package by.academy.lab5;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
//Создать приложение, получающее дату рождения (день, месяц и год) и определяющее в какой день недели Вы родились,
//сколько Вам полных лет и поздравляет с днем рождения, если оно сегодня (использовать классы из пакета java.time).
public class Task7DateOfBirth {
    public static Pattern patterndate = Pattern.compile("^\\d{2}[\\/\\-]\\d{2}[\\/\\-]\\d{4}$");
    public static LocalDate today = LocalDate.now();
 
    public static void main(String[] args) {
        LocalDate x = date(dateOfBirth());
        System.out.println(x);
        happyBirthday(x);
        System.out.println("dayOfBirth "+ dayOfBirth(x));
        System.out.println("Age: "+ age(x));
 
    }
 
    public static String dateOfBirth() {
        System.out.println("Enter date of birth ");
        try (Scanner scan = new Scanner(System.in)) {
            String dateOfBirth = scan.nextLine();
            if (checkdate(dateOfBirth) == false) {
                System.out.println("Change date: dd/mm/yyyy(dd-mm-yyyy)");
                while (checkdate(dateOfBirth) == false) {
                    System.out.println("Try again");
                    dateOfBirth = scan.nextLine();
                }
            }
            return dateOfBirth;
        }
    }
 
    public static boolean checkdate(String date) {
        Matcher matcher = patterndate.matcher(date);
        return matcher.matches();
    }
    public static LocalDate date (String s) {
            int year =Integer.parseInt(s.substring(6));
            int month =Integer.parseInt(s.substring(3, 5));
            int day = Integer.parseInt(s.substring(0, 2));
            LocalDate birth = LocalDate.of(year, month, day);
            return birth;
    }
    public static void happyBirthday(LocalDate date) {
        if (date.getMonth()==today.getMonth() & date.getDayOfMonth()==today.getDayOfMonth()) {
            System.out.println("Happy Birthday!");
        }
    }
    public static DayOfWeek dayOfBirth (LocalDate d) {
        DayOfWeek dayOfBirth = d.getDayOfWeek();
        return dayOfBirth;
    }
    public static Period age (LocalDate d) {
        Period period = Period.between (today, d);
        return period;
}
}
 