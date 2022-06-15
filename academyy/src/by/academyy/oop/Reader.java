package by.academyy.oop;
//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//ФИО,номер читательского билета, факультет, дата рождения, телефон.
//Методы takeBook(), returnBook().
//Разработать программу, в которой создается массив объектов данного класса.
//Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
//"Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс,
//содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
 
public class Reader {
    protected String name;
    protected long libraryCardNumber;
    protected String department;
    protected String dateOfBirth;
    protected String phoneNumber;
    
 
    public Reader(String name, long libraryCardNumber, String department, String dateOfBirth, String phoneNumber) {
        super();
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
 
    public void takeBook(int quantity) {
        System.out.println(name +" take "+ quantity + " books");
    }
 
    public void takeBook(String title) {
        System.out.println(name + " take book: " + title);
    }

    public void takeBook(Book ...books) {
        System.out.println(name +" take: ");
        for(Book b:books) {
        	 System.out.print(b.getTitle());
        	
        }
    }
 
    public void returnBook(int quantity) {
        System.out.println(name +" return "+ quantity + " books");
    }
 
    public void returnBook(String title) {
        System.out.println(name + " return book: " + title);
    }
    public void returnBook(Book b) {
        System.out.println(name + " return book: " + b);
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public long getLibraryCardNumber() {
        return libraryCardNumber;
    }
 
    public void setLibraryCardNumber(long libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public String getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Reader [name=");
        builder.append(name);
        builder.append(", libraryCardNumber=");
        builder.append(libraryCardNumber);
        builder.append(", department=");
        builder.append(department);
        builder.append(", dateOfBirth=");
        builder.append(dateOfBirth);
        builder.append(", phoneNumber=");
        builder.append(phoneNumber);
        builder.append("]");
        return builder.toString();
    }
 
}
 

 
