package io.codelex.questions.exercise3;

import java.util.Arrays;

public class Joiner<T> {


    String seperator;


    public Joiner(String seperator) {

        this.seperator = seperator;
    }

    @SafeVarargs
    public final String joinThem(T... itemOne) {
        return Arrays.stream(itemOne).map(T::toString).reduce((a, b) -> a + seperator + b).get();
    }
}