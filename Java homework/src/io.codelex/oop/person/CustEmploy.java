package io.codelex.oop.person;

import java.time.LocalDate;

public class CustEmploy {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "Smith", "1234-1609", 27, "CD01", 35);
        Employee employee1 = new Employee("Edward", "Smith", "EID57", 26, "Programmer", LocalDate.of(2020, 12, 25));


        System.out.println(employee1.getInfo());
        System.out.println(customer1.getInfo());
    }
}
