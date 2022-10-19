package io.codelex.questions.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {


    public DebitCard(int number, String owner, int ccvCode, double balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        super.addMoney(amount);
        printOutTooMuch();
    }

    @Override
    public void takeMoney(double amount) {
        super.takeMoney(amount);

    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }

    private void printOutTooMuch() {
        if (getBalance().compareTo(BigDecimal.valueOf(10000)) == 1) {
            System.out.println("\"Warning: Too much money\"");
        }
    }
}
