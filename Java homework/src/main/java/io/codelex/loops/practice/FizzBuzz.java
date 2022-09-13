package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int yourNum = input.nextInt();


        int i = 1;
        while( i <= yourNum){
            boolean test = false;

            if(i % 3 == 0){
                System.out.print("Fizz");
                test = true;
            }if(i % 5 == 0){
                System.out.print("Buzz");
                test = true;
            }if(!test){
             System.out.print(i);
            }
            System.out.print(" ");
            if(i % 20 == 0) {
                System.out.println();
            }
            i++;
        }



    }
}
