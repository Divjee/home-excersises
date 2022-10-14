package io.codelex.questions.exercise1;

import io.codelex.questions.exercise1.BankCards;

public class DebitCard extends BankCards {


    public DebitCard(int number, String owner, int ccvCode, double balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        super.addMoney(amount);
        tooMuch();
    }

    @Override
    public void takeMoney(double amount) {
        super.takeMoney(amount);

    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    private void tooMuch() {
        if (getBalance() > 10000) {
            System.out.println("\"Warning: Too much money\"");
        }
    }
}
