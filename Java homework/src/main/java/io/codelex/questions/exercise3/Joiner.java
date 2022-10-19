package io.codelex.questions.exercise3;

import java.util.Arrays;

public class Joiner<T> {


    String separator;


    public Joiner(String separator) {

        this.separator = separator;
    }

    @SafeVarargs
    public final String joinThem(T... itemOne) {
        return Arrays.stream(itemOne).map(T::toString).reduce((a, b) -> a + separator + b).get();
    }
}