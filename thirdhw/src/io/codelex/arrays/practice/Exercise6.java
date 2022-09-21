package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] firstArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100) + 1;
        }

        int[] copyOfFirstArr = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            copyOfFirstArr[i] = firstArray[i];
        }
        firstArray[9] = -7;
        System.out.println(Arrays.toString(firstArray));

        System.out.println(Arrays.toString(copyOfFirstArr));
    }
}
