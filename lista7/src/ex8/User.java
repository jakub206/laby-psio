package ex8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class User {
    private String name;
    private ArrayList<String> watchedGenres;
    private Queue<Movie> toWatch;

    public User(String name) {
        this.name = name;
        this.watchedGenres = new ArrayList<>();
        this.toWatch = new LinkedList<>();
    }

    public void addGenre(String genre) {
        watchedGenres.add(genre);
    }

    public void addToWatch(Movie movie) {
        toWatch.add(movie);
    }

    public void printToWatch() {
        if(toWatch.isEmpty()) {
            System.out.println(name+"'s to-watch list is empty");
        } else {
            System.out.println(name+"'s to-watch list:");
            for (Movie movie : toWatch) {
                System.out.println("* " + movie);
            }
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getWatchedGenres() {
        return watchedGenres;
    }

    public void setWatchedGenres(ArrayList<String> watchedGenres) {
        this.watchedGenres = watchedGenres;
    }
}