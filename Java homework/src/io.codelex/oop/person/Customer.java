package io.codelex.oop.person;

public class Customer extends Person {
    String customerId;
    int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + customerId + " (" + getPurchaseCount() + " purchases)";
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
}
