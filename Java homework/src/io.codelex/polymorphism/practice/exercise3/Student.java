package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public Student(String firstName, String lastName, String adress, int id, double gpa) {
        super(firstName, lastName, adress, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void display() {
        super.display() ;
        System.out.println("and has a GPA of: "+ getGpa()+".");
    }
}
