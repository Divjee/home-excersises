package io.codelex.questions.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private int number;
    private String owner;
    private int ccvCode;
    private BigDecimal balance;

    public Card(int number, String owner, int ccvCode, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccvCode = ccvCode;
        this.balance = BigDecimal.valueOf(balance);
    }

    public void addMoney(double amount) {

        balance = balance.add(BigDecimal.valueOf(amount));

    }

    public void takeMoney(double amount) {
        if (balance.compareTo(BigDecimal.valueOf(amount)) == -1) {
            throw new NotEnoughFundsException("Not enough money");
        } else {
            balance = balance.subtract(BigDecimal.valueOf(amount));
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
