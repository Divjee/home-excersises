package io.codelex.questions.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(partOf(numbers, (a) -> a % 2 == 1));

        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        System.out.println(partOf(names, (a) -> a.length() > 4));
    }

    public static <T> double partOf(List<T> list, Predicate<T> someFunction) {

        double listSize = list.size();
        return list.stream().filter(someFunction).toList().size() / listSize;
    }
}