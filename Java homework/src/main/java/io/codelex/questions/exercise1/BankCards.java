package io.codelex.questions.exercise1;

public abstract class BankCards {
    private int number;
    private String owner;
    private int ccvCode;
    private double balance;

    public BankCards(int number, String owner, int ccvCode, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }


    public void takeMoney(double amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException("Not enough money");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
