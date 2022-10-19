package io.codelex.streams.examples;

public class CombinerApp {
    public static void main(String[] args) {
        Combiner<Integer,String> combiner = new Combiner<>(10, "Teksts", (a, b) -> a.toString() + "-" + b);

        System.out.println(combiner.combine());
    }
}
