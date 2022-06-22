package by.academyy.InnerClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
//Создать класс Library, в котором будет лист книг.
//Используя класс типа List организовать работу с библиотечными книгами. начальное формирование библиотеки ,
//вывод библиотеки, удаление книг. количество страниц , в которых больше заданного, вывод информации о книге
//с наибольшим годом выпуска.
 
public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Энциклопедия", "С.В.", 300, 1977);
        Book b2 = new Book("Экономическая теория", "М.Н.", 120, 2000);
        Book b3 = new Book("Справочник", "Р.В.", 100, 1995);
        Book b4 = new Book("Статистика", "П.П.", 80, 2005);
        Book b5 = new Book("Высшая математика", "И.И.", 105, 1980);
        
        ArrayList<Book> library = new ArrayList<>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        
 
        System.out.println(library.stream().filter(book->book.getNumberOfpages() >100).collect(Collectors.toList()));
        
        System.out.println(library.stream().sorted().collect(Collectors.toList()));
        
    }
}
 
  
