package io.codelex.collections.practice.phonebook;

public class PhoneDirecotryTest {
    public static void main(String[] args) {

        PhoneEntry number1 = new PhoneEntry("Bob", "28283392");
        PhoneEntry number2 = new PhoneEntry("John", "27897534");
        PhoneEntry number3 = new PhoneEntry("Harry", "27897530");
        PhoneEntry number4 = new PhoneEntry("Bob", "27897531");

        PhoneDirectory2 phoneBook = new PhoneDirectory2();

        phoneBook.addNewNumber(number1.name, number1.number);
        phoneBook.addNewNumber(number2.name, number2.number);
        phoneBook.addNewNumber(number3.name, number3.number);
        phoneBook.addNewNumber(number4.name, number4.number);
        System.out.println(phoneBook.getPhoneBook());
    }
}
