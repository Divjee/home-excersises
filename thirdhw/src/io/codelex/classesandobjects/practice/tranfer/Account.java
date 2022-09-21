package io.codelex.classesandobjects.practice.tranfer;

public class Account {
    private double balance;
    String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " " + balance;
    }
}
