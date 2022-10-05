package io.codelex.classesandobjects.practice.savings;

import java.util.Scanner;

public class SavingAcc {
    public static void main(String[] args) {
        int startingBalance;
        double annualInterestRate;
        int months;
        int deposit;
        int withdraw;
        double interestEarned = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("How much money is in the account?");
        startingBalance = in.nextInt();

        System.out.println("What is the annual interest rate?");
        annualInterestRate = in.nextDouble();

        System.out.println("How long has the account been open?");
        months = in.nextInt();

        SavingsAccount money = new SavingsAccount(startingBalance, annualInterestRate);


        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount deposited for month " + i);
            deposit = in.nextInt();
            money.deposit(deposit);

            System.out.println("Enter amount withdrawn for month " + i);
            withdraw = in.nextInt();
            money.withdrawal(withdraw);

            money.addInterest(annualInterestRate);

            interestEarned += money.getLastInterest();
        }

        System.out.println("Balance is: " + money.getBalance());
        System.out.println("Total amount of deposit: " + money.getTotalDeposit());
        System.out.println("Total amount of withdrwal: " + money.getTotalWithdrawal());
        System.out.println("Total interest earned: " + interestEarned);
    }
}
