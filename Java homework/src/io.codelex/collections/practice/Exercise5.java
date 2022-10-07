package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        String number = in.nextLine();

        isHappyNumber(number);

    }

    public static void isHappyNumber(String number) {
        String[] numArr = number.split("");
        List<String> list = new ArrayList<>();

        for (String i : numArr) {
            list.add(i);
        }
        double sum2 = 0;
        while (sum2 != 1) {
            String equals = "=";
            double sum = 0;

            for (int i = 0; i < list.size(); i++) {
                sum += Math.pow(Double.parseDouble(list.get(i)), 2);
                if (i == list.size() - 1) {
                    System.out.print(list.get(i) + "^2 " + equals + " " + ((int) sum));
                } else {
                    System.out.print(list.get(i) + "^2 + ");
                }
            }
            System.out.println();
            list.removeAll(list);
            String[] sumArr = String.valueOf((int) sum).split("");
            for (String i : sumArr) {
                list.add(i);
            }
            if (sum == 1 && list.size() == 1) {
                System.out.println("This is a happy number");
            } else if (sum != 1 && list.size() == 1) {
                System.out.println("...\nThis is not a happy number");
            }

            sum = 0;
            sum2 = list.size();
        }
    }
}

