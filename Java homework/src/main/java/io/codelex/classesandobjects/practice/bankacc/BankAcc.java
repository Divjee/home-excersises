package io.codelex.classesandobjects.practice.bankacc;

import java.util.Scanner;

public class BankAcc {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson");


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your account balance");
        double balance = in.nextDouble();
        benben.setBalance(balance);
        System.out.println("Enter the amount you want to withdraw");
        double withdraw = in.nextDouble();
        benben.withdraw(withdraw);
        System.out.println("Enter the amount you want to deposit");
        double deposit = in.nextDouble();
        benben.deposit(deposit);

        System.out.println(benben);

    }
}
