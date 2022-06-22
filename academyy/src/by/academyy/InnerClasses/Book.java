package by.academyy.InnerClasses;
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int NumberOfpages;
    private long yearOfIssue;
 
    public Book() {
        super();
    }
 
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Book [title=");
        builder.append(title);
        builder.append(", author=");
        builder.append(author);
        builder.append(", NumberOfpages=");
        builder.append(NumberOfpages);
        builder.append(", yearOfIssue=");
        builder.append(yearOfIssue);
        builder.append("]");
        return builder.toString();
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public int getNumberOfpages() {
        return NumberOfpages;
    }
 
    public void setNumberOfpages(int numberOfpages) {
        NumberOfpages = numberOfpages;
    }
 
    public long getYearOfIssue() {
        return yearOfIssue;
    }
 
    public void setYearOfIssue(long yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
 
    public Book(String title, String author, int numberOfpages, long yearOfIssue) {
        super();
        this.title = title;
        this.author = author;
        NumberOfpages = numberOfpages;
        this.yearOfIssue = yearOfIssue;
    }
 
    @Override
    public int compareTo(Book b) {
        long year = b.getYearOfIssue();
        return (int) (this.yearOfIssue - year);
    }
}