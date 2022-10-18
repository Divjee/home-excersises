package main.java.io.codelex.typesandvariables.practice;

public class Exercise8 {
    public static void main(String[] args) {
        minutes(13);

    }

    public static void minutes(double min) {
        double year = min / 525600;
        double day = min / 1440;

        System.out.println(min + " minutes is approximately " + year + " years and " + day + " days.");
    }

}
