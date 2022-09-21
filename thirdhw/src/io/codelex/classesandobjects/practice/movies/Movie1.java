package io.codelex.classesandobjects.practice.movies;

import io.codelex.classesandobjects.practice.movies.Movie;

public class Movie1 {
    public static void main(String[] args) {

        Movie movie1 = new Movie("CASINO ROYALE", "EON PRODUCTIONS", "PG");
        Movie movie2 = new Movie("DORA THE EXPLORER", "NIKOLODEAN", "PG");
        Movie movie3 = new Movie("SCARFACE", "WARNER BROS", "PG13");
        Movie movie4 = new Movie("AVATAR", "WARNER BROS", "PG");
        Movie movies = new Movie();

        Movie[] cinema2 = {movie1,movie2,movie3,movie4};

        movies.getPg(cinema2);

        }


    }





