package io.codelex.classesandobjects.practice.savings;

public class SavingsAccount {

    private double balance;
    private double annualInterestRate;
    private double monthlyInterestRate;
    private int totalDeposit;
    private int totalWithdrawal;
    private double lastInterest;



    protected SavingsAccount(int startingAmount, double annualInterestRate) {
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

    public double getBalance() {
        return balance;
    }

    public int getTotalDeposit() {
        return totalDeposit;
    }

    public int getTotalWithdrawal() {
        return totalWithdrawal;
    }

    public double getLastInterest() {
        return lastInterest;
    }
}
