package io.codelex.arithmetic.practice;

public class Exercise6 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 110) {
            boolean isAmultiple = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                isAmultiple = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                isAmultiple = true;
            }
            if (i % 7 == 0) {
                System.out.print("woza");
                isAmultiple = true;
            }
            if (!isAmultiple) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }

    }
}
