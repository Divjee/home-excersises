package io.codelex.classesandobjects.practice.bankacc;

import java.util.Scanner;

public class BankAcc {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson");

        double deposit = 0;
        double balance = 0;
        double withdraw;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your account balance");
        balance = in.nextDouble();
        benben.balance = balance;
        System.out.println("Enter the amount you want to withdraw");
        withdraw = in.nextDouble();
        benben.withdraw(withdraw);
        System.out.println("Enter the amount you want to deposit");
        deposit = in.nextDouble();
        benben.deposit(deposit);

        System.out.println(benben.toString());

    }
}
