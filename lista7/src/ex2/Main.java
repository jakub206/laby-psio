package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        HashMap<String, ArrayList<Book>> booksByAuthor = new HashMap<>();

        books.add(new Book("Lalka", "Bolesław Prus", 1890, true));
        books.add(new Book("Pan Tadeusz", "Adam Mickiewicz", 1834, false));
        books.add(new Book("Ferdydurke", "Witold Gombrowicz", 1937, false));
        books.add(new Book("Faraon", "Bolesław Prus", 1897, false));
        books.add(new Book("Chłopi", "Władysław Reymont", 1904, true));
        books.add(new Book("Granica", "Zofia Nałkowska", 1935, true));

        for (Book b : books) {
            if (booksByAuthor.containsKey(b.getAuthor())) {
                booksByAuthor.get(b.getAuthor()).add(b);
            } else {
                ArrayList<Book> temp = new ArrayList<>();
                temp.add(b);
                booksByAuthor.put(b.getAuthor(), temp);
            }
        }

        int max = 0;
        String maxAuthor = "";
        for (Map.Entry<String, ArrayList<Book>> booksMap : booksByAuthor.entrySet()) {
            String author = booksMap.getKey();
            ArrayList<Book> bookList = booksMap.getValue();
            int bookCounter = bookList.size();
            System.out.println(author+": " + bookCounter);

            if (bookCounter > max) {
                max = bookCounter;
                maxAuthor = author;
            }
        }
        System.out.println("The most books ("+max+") has "+maxAuthor);
        System.out.println();

        int X = 1900;
        System.out.println("Books published after "+X+":");
        for(Book b : books){
            if(b.getYear()>X){
                System.out.println("* "+b);
            }
        }
        System.out.println();

        System.out.println("Books which was borrowed: ");
        for(Book b : books){
            if(b.isBorrowed()){
                System.out.println("* "+b);
            }
        }
        System.out.println();

        books.sort((b1,b2) -> Integer.compare(b1.getYear(), b2.getYear()));
        System.out.println("All books after sorting by year:");
        for(Book b : books){
            System.out.println("* "+b);
        }
    }
}