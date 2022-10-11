package io.codelex.polymorphism.practice.exercise4;

public class Commision extends Hourly {
    double salesMade=0;
    double commisionRate;


    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
    }

    @Override
    public void addHours(int moreHours) {
        super.addHours(moreHours);
    }

    public double totalSales(double salesMade){
        return this.salesMade = salesMade;

    }

    @Override
    public double pay() {
        double payment = (salesMade * commisionRate) + super.pay();
        salesMade = 0;
        return payment;
    }

    @Override
    public String toString() {

        return super.toString() + "\nSales made: "+ salesMade;
    }
}
