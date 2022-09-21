package io.codelex.classesandobjects.practice.savings;

public class SavingsAccount {

    double balance;
    double annualInterestRate;
    double monthlyInterestRate;
    int totalDeposit;
    int totalWithdrawal;
    double lastInterest;



    public SavingsAccount(int startingAmount, double annualInterestRate) {
        balance = startingAmount;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdrawal(int withdraw){
       balance -= withdraw;
       totalWithdrawal += withdraw;
    }

    public void deposit(int deposit){
       balance += deposit;
       totalDeposit += deposit;
    }

    public void addInterest(double annualInterestRate){
        monthlyInterestRate = annualInterestRate / 12;
        lastInterest = monthlyInterestRate * balance;
        balance += lastInterest;
    }


}
