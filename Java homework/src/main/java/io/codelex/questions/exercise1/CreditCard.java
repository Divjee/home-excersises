package io.codelex.questions.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(int number, String owner, int ccvCode, double balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {

        super.addMoney(amount);
    }

    @Override
    public void takeMoney(double amount) {
        super.takeMoney(amount);
        printOutWarningLow();
    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }

    private void printOutWarningLow() {
        if (getBalance().compareTo(new BigDecimal(100)) == -1) {
            System.out.println("\"Warning: Low funds\"");
        }
    }
}
