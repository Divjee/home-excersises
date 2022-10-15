package io.codelex.questions.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Cards {

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
        printOutwarningLow();
    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }

    private void printOutwarningLow() {
        int compare = getBalance().compareTo(new BigDecimal(100));
        if (compare == -1) {
            System.out.println("\"Warning: Low funds\"");
        }
    }
}
