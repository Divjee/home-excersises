package io.codelex.questions.exercise3;

public class Joiner<T> {



    String seperator;
    String result = "";


    public Joiner(String seperator) {

        this.seperator = seperator;
    }

    public String joinThem(T... itemOne) {
        for (Object i : itemOne) {
            result = result + i.toString() + seperator;
        }
        return result;

    }
}
