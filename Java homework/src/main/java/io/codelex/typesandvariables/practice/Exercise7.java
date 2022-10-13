package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int upper = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text");

        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }
        System.out.println(upper);
    }
}