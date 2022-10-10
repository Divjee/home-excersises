package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MakeSounds {
    public static void main(String[] arg) throws InterruptedException {

        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        List<Sound>sounds = new ArrayList<>();
            sounds.add(firework);
            sounds.add(radio);
            sounds.add(firework);
            sounds.add(parrot);

            for(Sound i : sounds){
                i.playSound();
            }
    }
}
