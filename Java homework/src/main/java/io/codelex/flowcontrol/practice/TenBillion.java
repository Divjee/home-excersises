package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();


        //todo - check if Long
        //if (n != (long)n) {
            //todo - check if n is less than zero
            if (n < 0) {
                n *= -1;
            }
            //fixme
            if (n >= 10000000000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                if (n >= 1000000000) {
                    digits += 9;
                } else if (n >= 100000000) {
                    digits += 8;
                    n /= 100000000;
                } else if (n >= 10000000) {
                    digits += 7;
                    n /= 10000000;
                } else if (n >= 1000000) {
                    digits += 6;
                    n /= 10000000;
                } else if (n >= 100000) {
                    digits += 5;
                    n /= 100000;
                } else if (n >= 10000) {
                    digits += 4;
                    n /= 10000;
                } else if (n >= 1000) {
                    digits += 3;
                    n /= 1000;
                } else if (n >= 100) {
                    digits += 2;
                } else if (n >= 10) {
                    digits += 1;
                    n /= 100;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } /*else {
            System.out.println("The number is not a long");
        }*/

    }
