package io.codelex.polymorphism.practice.exercise3;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String adress;
    private int id;

    public Person() {
    }

    public Person(String firstName, String lastName, String adress, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void display(){
        System.out.println(getFirstName()+" "+getLastName()+" has id Nr."+ getId()+", residence adress is: "+getAdress()+", ");
    }
}
