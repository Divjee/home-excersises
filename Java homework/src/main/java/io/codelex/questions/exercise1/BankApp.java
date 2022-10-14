package io.codelex.questions.exercise1;

public class BankApp {
    public static void main(String[] args) {


        CreditCard creditCard = new CreditCard(123456, "Divje", 014,150.34 );
        DebitCard debitCard = new DebitCard(1343252,"Divje", 884, 9000);

        debitCard.addMoney(123123);
        creditCard.takeMoney(55);
        creditCard.takeMoney(1233);


    }


}
