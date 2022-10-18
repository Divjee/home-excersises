package io.codelex.classesandobjects.practice.movies;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public static void main(String[] args) {

        MovieSupport movie1 = new MovieSupport("CASINO ROYALE", "EON PRODUCTIONS", "PG");
        MovieSupport movie2 = new MovieSupport("DORA THE EXPLORER", "NIKOLODEAN", "PG");
        MovieSupport movie3 = new MovieSupport("SCARFACE", "WARNER BROS", "PG13");
        MovieSupport movie4 = new MovieSupport("AVATAR", "WARNER BROS", "PG");

        List<MovieSupport> cinema = new ArrayList<>();
        cinema.add(movie1);
        cinema.add(movie2);
        cinema.add(movie3);
        cinema.add(movie4);

        getPgMovies(cinema);
    }
    private static void getPgMovies(List<MovieSupport> cinema) {
        for (int i = 0; i < cinema.size(); i++) {
            if (cinema.get(i).getRating().equals("PG")) {
                System.out.println(cinema.get(i));
            }
        }
    }
}





