package com.edwaldoalmeida.javalivesummary.interfaces.withComparable;

public class Movie implements Comparable<Movie> {
    
    private String name;
    private double imdb;

    public Movie(String name, double imdb) {
        this.name = name;
        this.imdb = imdb;
    }

    public String getName() {
        return this.name;
    }

    public double getImdb() {
        return this.imdb;
    }

    @Override
    public int compareTo(Movie o) {
        if (this.getImdb() > o.getImdb()) return 1; // would it work with `o.imdb` ?
        if (this.getImdb() < o.getImdb()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.imdb + ")";
    }

}
