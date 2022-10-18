package io.codelex.classesandobjects.practice.tranfer;

import io.codelex.classesandobjects.practice.tranfer.Account;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Account matt = new Account("Matts acc", 1000);
        Account bob = new Account("Bobs Acc", 0);

        transfer(matt, bob);
    }

    public static void transfer(Account from, Account to) {
        Scanner in = new Scanner(System.in);
        double withdraw;
        System.out.println("How much would you like to withdraw?");
        withdraw = in.nextDouble();
        from.withdrawal(withdraw);
        to.deposit(withdraw);
        System.out.println("You have withdrawn $" + withdraw + " amount from " + from.owner + " account and" +
                "transferred $" + withdraw + " to" + to.owner + "account.");
        System.out.println(from.owner + " current bank accounts balance is: " + "$" + from.balance());
        System.out.println(to.owner + " current bank account balance is: " + "$" + to.balance());
    }
}
