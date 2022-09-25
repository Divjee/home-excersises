package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        pattern(11);

    }

    private static void pattern(int n){
        int nMinus = n -1;
        int lines = nMinus * 2;
        int starCount = 8;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= lines ; j++) {
                System.out.print("//");
            }
            for (int j = 1; j <= starCount * i - 8; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= lines ; j++) {
                System.out.print("\\\\");
            }
            System.out.println();
            lines -=2;
        }
    }
}