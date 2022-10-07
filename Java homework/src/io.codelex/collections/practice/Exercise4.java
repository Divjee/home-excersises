package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> list1 = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String name = in.nextLine();
            list1.add(name);
            if (name.equals("")) {
                list1.remove("");
                System.out.print("Unique list name contains: ");
                for (String i : list1) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }
}

