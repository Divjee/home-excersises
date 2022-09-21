package io.codelex.classesandobjects.practice.movies;

public class Movie {
    protected String title;
    protected String studio;
    protected String rating;

    public Movie() {
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }


    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPg(Movie[] cinema) {
        Movie[] cinema2 = new Movie[4];
        int counter = 0;
        for (int i = 0; i < cinema.length; i++) {
            if (cinema[i].rating.equals("PG")) {
                cinema2[counter] = cinema[i];
                System.out.println(cinema2[counter].title + " " + cinema2[counter].studio+ " "+  cinema[counter].rating);
            }
            counter++;
        }
        return cinema2;
    }
}