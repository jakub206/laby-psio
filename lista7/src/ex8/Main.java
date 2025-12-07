package ex8;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Movie> movies = new ArrayList<>();
    static HashMap<String, ArrayList<Movie>> moviesByGenre = new HashMap<>();

    public static void main(String[] args) {
        User u1 = new User("Jakub");
        User u2 = new User("Wojtek");
        User u3 = new User("Bartek");
        u1.addGenre("Comedy");
        u2.addGenre("Fantasy");
        u2.addGenre("Sci-fi");
        u3.addGenre("Drama");
        u3.addGenre("Romance");
        users.add(u1);
        users.add(u2);
        users.add(u3);

        movies.add(new Movie("Blade Runner 2049", "Sci-fi", 8.0));
        movies.add(new Movie("Gran Torino", "Drama", 8.1));
        movies.add(new Movie("Knives Out", "Comedy", 6.4));
        movies.add(new Movie("La La Land", "Romance", 8.4));
        movies.add(new Movie("Dunkierka", "Drama", 5.6));

        for (Movie m : movies) {
            if (!moviesByGenre.containsKey(m.getGenre())) {
                moviesByGenre.put(m.getGenre(), new ArrayList<>());
            }
            moviesByGenre.get(m.getGenre()).add(m);
        }

        for (HashMap.Entry<String, ArrayList<Movie>> entry : moviesByGenre.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        for(User u : users) {
            System.out.println(u.getName()+" - list of recommendation:");
            for(Movie m : movies) {
                if(u.getWatchedGenres().contains(m.getGenre())) {
                    System.out.println("* "+m);
                }
            }
            System.out.println();
        }

        u1.addToWatch(new Movie("Blade Runner 2049", "Sci-fi", 8.0));

        u1.printToWatch();
        u2.printToWatch();
    }
}