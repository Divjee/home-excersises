package io.codelex.collections.practice.phonebook;

import java.util.Scanner;
import java.util.TreeMap;

public class PhoneDirectory2 {

    TreeMap<String, String> phoneBook;

    public PhoneDirectory2() {
        phoneBook = new TreeMap<>();
    }

    public String getName(String number) {
        for (String i : phoneBook.keySet()) {
            if (phoneBook.get(i).equals(number)) {
                return i;
            }
        }
        return "no number is assigned to such name";
    }

    public String findNumber(String name) {
        return phoneBook.get(name);
    }

    public TreeMap<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void addNewNumber(String name, String number) {
        Scanner in = new Scanner(System.in);
        String yesNo;
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (phoneBook.keySet().size() == 0) {
            phoneBook.put(name, number);
        }
        for (String i : phoneBook.keySet()) {
            if (i.equals(name) && phoneBook.get(i).equals(number)) {
                break;
            } else if (phoneBook.get(i).equals(number)) {
                System.out.println("Such number: " + number + " already exists for the name: " + i + ". Do you still wish to add?(Y/N)");
                yesNo = in.nextLine();
                if (yesNo.equals("Y")) {
                    phoneBook.put(name, number);
                    break;
                } else if (yesNo.equals("N")) {
                    break;
                }
            } else if (i.equals(name)) {
                System.out.println("Such name: " + i + "  already has a number: " + phoneBook.get(i) + ". Do you wish to change number to " + number + " (Y/N)?");
                yesNo = in.nextLine();
                if (yesNo.equals("Y")) {
                    phoneBook.put(name, number);
                    break;
                } else if (yesNo.equals("N")) {
                    break;
                }
            } else {
                phoneBook.put(name, number);
                break;
            }


        }

    }
}
