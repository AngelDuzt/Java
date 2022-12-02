package MireaJava.Ex2.ExBook;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
