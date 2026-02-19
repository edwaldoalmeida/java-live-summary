package com.edwaldoalmeida.javalivesummary.interfaces.withComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoviePicker {
    public static void main(String[] args) {
        
        List<Movie> myMovies = new ArrayList<Movie>() {
            {
                add(new Movie("Movie1", 1));
                add(new Movie("Movie3", 3));
                add(new Movie("Movie2", 2));
                add(new Movie("Movie5", 5));
                add(new Movie("Movie4", 4));
            }
        };

        myMovies.sort(Comparator.reverseOrder());
        System.out.println(myMovies);

        myMovies.sort(Comparator.naturalOrder());
        System.out.println(myMovies);

    }
}
