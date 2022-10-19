package io.codelex.exceptions.practice;

public class Exercise2 {

    private int a;

    public Exercise2(int a) {
        this.a = a;
    }

    public void methodA() throws ArithmeticException {
        methodB();
    }

    public void methodB() throws ArithmeticException {
        methodC();
    }

    public void methodC() throws ArithmeticException {
        System.out.println(a/0);
    }
}
