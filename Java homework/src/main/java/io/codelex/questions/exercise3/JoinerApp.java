package io.codelex.questions.exercise3;

public class JoinerApp {
    public static void main(String[] args) {
        Joiner<Integer> join = new Joiner<>("-");
        Joiner<String> join2 = new Joiner<>("-");

        System.out.println(join2.joinThem("yoo", "wsuup","Gunit"));
        System.out.println(join.joinThem(4324, 4343143, 1515151, 414, 4544));
    }
}