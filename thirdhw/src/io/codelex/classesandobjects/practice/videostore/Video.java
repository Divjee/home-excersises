package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;

    private boolean checkedOut = false;

    private double averageRating = 0;

    private double ratingCount = 0;

    private double usersLiked = 0;


    public Video(String title) {
        this.title = title;
    }

    protected void setAverageUserRating(double newRating) {
        double rateCount = ratingCount + 1;
        averageRating = ((averageRating * ratingCount) + newRating) / rateCount;
        ratingCount = rateCount;

        if (newRating > 3) {
            usersLiked++;
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return checkedOut;
    }

    public void isCheckedOut() {
        checkedOut = true;
    }

    public void isReturned() {
        checkedOut = false;
    }

    public double getRatingCount() {
        return ratingCount;
    }

    public double getUsersLiked() {
        return usersLiked;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", checkedOut=" + checkedOut +
                ", averageUserRating=" + averageRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video video)) return false;

        if (checkedOut != video.checkedOut) return false;
        if (Double.compare(video.averageRating, averageRating) != 0) return false;
        if (Double.compare(video.getRatingCount(), getRatingCount()) != 0) return false;
        return getTitle().equals(video.getTitle());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getTitle().hashCode();
        result = 31 * result + (checkedOut ? 1 : 0);
        temp = Double.doubleToLongBits(averageRating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getRatingCount());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}



