package ex2;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year, boolean borrowed){
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = borrowed;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String toString() {
        return title+", "+author+", "+year+ ", "+borrowed;
    }
}