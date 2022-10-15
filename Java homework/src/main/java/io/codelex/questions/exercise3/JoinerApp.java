package io.codelex.questions.exercise3;

public class JoinerApp {
    public static void main(String[] args) {
        Joiner join = new Joiner<>("-");

        System.out.println(join.joinThem(54));
        System.out.println(join.joinThem("FWGWG", 4343143, 1515151, "hello", 4544));
    }
}