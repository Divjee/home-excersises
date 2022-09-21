package io.codelex.arrays.practice.exercise8;

import java.util.Random;

public class Exercise8part2 {
    static String hiddenWord = "";
    static String word = "";
    static String[] words = {"kaleidescope","virtuous","mountain"};
    static String correctLetters = "";
    static String incorrectLetters = "";

    public static String randomWord() {
        Random rand = new Random();
        int randNr = rand.nextInt(words.length);
        word = words[randNr].toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            hiddenWord = hiddenWord + "_";
        }
        return word;
    }

    public static String progress(char letterGuessed) {
        char[] wordArr = word.toCharArray();
        char[] hiddenArr = hiddenWord.toCharArray();
        for (int i = 0; i < wordArr.length; i++) {
            char isChar = wordArr[i];
            if (letterGuessed == isChar) {
                correctLetters += letterGuessed;
                hiddenArr[i] = wordArr[i];
            }
        }
        System.out.println("Guess: " + correctLetters.replaceAll("(.)\\1{1,}", "$1"));
        hiddenWord = String.valueOf(hiddenArr);
        System.out.println("Word: "+ hiddenWord);
        return hiddenWord;
    }
}
