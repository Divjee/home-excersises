package io.codelex.classesandobjects.practice.movies;

public class MovieSupport {
    private String title;
    private String studio;
    private String rating;

    public MovieSupport() {
    }

    public MovieSupport(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }


    public MovieSupport(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}