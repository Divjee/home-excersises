package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person{
    private String jobTtile;

    public Employee(String jobTtile) {
        this.jobTtile = jobTtile;
    }

    public Employee(String firstName, String lastName, String adress, int id, String jobTtile) {
        super(firstName, lastName, adress, id);
        this.jobTtile = jobTtile;
    }

    public String getJobTtile() {
        return jobTtile;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("and works as: " + getJobTtile()+".");
    }

}
