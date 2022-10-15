package io.codelex.questions.exercise1;

import java.math.BigDecimal;

public abstract class Cards {
    private int number;
    private String owner;
    private int ccvCode;
    private BigDecimal balance;

    public Cards(int number, String owner, int ccvCode, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccvCode = ccvCode;
        this.balance = BigDecimal.valueOf(balance);
    }

    public void addMoney(double amount) {

        balance = balance.add(BigDecimal.valueOf(amount));

    }

    public void takeMoney(double amount) {
        int ifTrue = balance.compareTo(BigDecimal.valueOf(amount));
        if (ifTrue == -1) {
            throw new NotEnoughFundsException("Not enough money");
        } else {
            balance = balance.subtract(BigDecimal.valueOf(amount));
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
