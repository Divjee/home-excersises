package io.codelex.generics.practice.exercise4.exercise1;

public class Test {
    public static void main(String[] args) {
        ListOne listOne = new ListOne();
        listOne.add(0,"Hello");
        listOne.add(1,"Bye");
        System.out.println(listOne.get(1));
        System.out.println(listOne.list); //Using a specific type, we do not get null when we try to get a par of the list

        SubclassInt subclassInt = new SubclassInt();
        subclassInt.add(0,45);
        System.out.println(subclassInt.list); //Using object as parameter, we can have many interfaces but we have to use cast in the add method, get method returns null, as it is just an object.

        SublassString sublassString = new SublassString();
        sublassString.add(0,"Whatsup");
        sublassString.add(1,"Heyo");
        System.out.println(sublassString.list); //same as the above one.

        GenericList genericList = new GenericList();
        genericList.add(0,76.74);
        genericList.add(0,"Hello"); // using generic type our list can have different types in it, but i think the same can be done using objects class.
        System.out.println(genericList.list);


    }
}
