package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the numerator");
                String numerator = scanner.next();
                if (numerator.equals("Q") || numerator.equals("q")) {
                    break;
                } else {
                    Integer.parseInt(numerator);
                    System.out.println("Enter the divisor");
                    int divisor = scanner.nextInt();
                    System.out.println(numerator + " / " + divisor + " = " + Integer.parseInt(numerator) / divisor);
                }

            } catch (NumberFormatException ne) {
                System.out.println("You enetered bad data \n please try again");
                System.out.println();
            } catch (ArithmeticException ae) {
                System.out.println("You cant divide by zero");
                System.out.println();
            }catch (InputMismatchException ie){
                System.out.println("You enetered bad data \n please try again");
                System.out.println();
                scanner.next();
            }
        }
    }
}
