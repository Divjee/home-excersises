package io.codelex.oop.person;

public abstract class Person {
    String firstName;
    String lastName;
    String Id;
    int age;

    public Person(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        Id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public abstract String getInfo();
}
