package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student("Harry","Potter","Dursleys basement",12,3.5);
        Employee employee = new Employee("Dobby", "Elf", "Malfoys house", 10, "House elf");
        student.display();
        System.out.println();
        employee.display();
    }
}
