package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(i -> (int) Math.sqrt(i)).collect(toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).collect(toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).collect(Collectors.toSet()).stream().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(i -> i.getAge() > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(toList());
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().reduce(Integer::sum).get();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).collect(toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(i -> i.split(" ")[0]).collect(toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(i-> i.split("")).flatMap(Arrays::stream).distinct().collect(toList());
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return (double) users.stream().map(User::getAge).reduce(0, Integer::sum) / users.size();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(User::getAge).toList().stream().max(Integer::compare).get();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).toList().stream().min(Integer::compare).get();

    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, toList()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge, toList()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge, toList())));

    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(User::isMale, Collectors.counting()));

    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(i -> i.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().anyMatch(i -> i.getAge() != age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.parallelStream().sorted(Comparator.comparingInt(User::getAge)).collect(toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed().toList().stream();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.range(2,100).filter(StreamsExercise::isPrime).limit(10).boxed().collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
       return  new Random().ints(10, 0, 10000).boxed().collect(toList());
    }

    public static User findOldest(List<User> users) {
        return users.stream().reduce((a, b) -> a.getAge() > b.getAge() ? a : b).get();
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).reduce((a, b) -> a += b).get();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
    }
}
