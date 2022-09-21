package io.codelex.classesandobjects.practice.bankacc;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    double totalAmount;


    public BankAccount(String name) {
        this.name = name;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
         balance += amount;
    }

    public final void withdraw(double amount) {
         balance -=  amount;
    }

    @Override
    public String toString() {
        if(balance < 0){
            return name + ", " + "-$"+ (Math.floor( balance*100) / 100)* -1;
        }else{
            return name + ", " +"$"+ (Math.floor(balance * 100)/100);
        }
    }
}
