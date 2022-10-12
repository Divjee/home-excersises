package io.codelex.streams.examples;

import java.util.function.BiFunction;

public class Combiner<T, E> {
    /* Izveidot klasi Combiner, kura konstruktorā saņem divus objektus ar dažādiem generic tipiem un saņem funkciju, kura
     * šos abus objektus var pārveidot par String
     * Piemērs funkcionalitātei:
     * Combiner combiner = new Combiner(10, "Teksts", (a, b) -> ???);
     * String result = combiner.combine();
     * System.out.println(result); //Expected result "10-Teksts"
     * */
    private T one;
    private E two;
    private BiFunction<T, E, String> combiner;

    public Combiner(T one, E two, BiFunction<T, E, String> combiner) {
        this.one = one;
        this.two = two;
        this.combiner = combiner;
    }

    public String combine() {
        return combiner.apply(one, two);
    }


}
