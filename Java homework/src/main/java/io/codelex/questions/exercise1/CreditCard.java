package io.codelex.questions.exercise1;

import io.codelex.questions.exercise1.BankCards;

public class CreditCard extends BankCards {


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
        warningLow();
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    private void warningLow(){
        if(getBalance() < 100){
            System.out.println("\"Warning: Low funds\"");
        }
    }

}
