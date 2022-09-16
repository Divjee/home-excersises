package io.codelex.arithmetic.practice;


public class Exercise8 {

    public static void main(String[] args) throws Exception {
        employeePay("Divje", 8, 45);
    }


    public static void employeePay(String name, double basePay, double hoursWorked) throws Exception {
        double overTime;
        double totalPay;

        if (hoursWorked > 60 || basePay < 8) {
            throw new Exception("Employee working hours must be below 60 and base pay cant be lower than 8");
        } else if (hoursWorked > 40 || basePay >= 8) {
            overTime = (hoursWorked - 40) * (1.5 * basePay);
            totalPay = 40 * basePay + overTime;
            System.out.println(name + " " + totalPay);
        } else if (hoursWorked <= 40 || basePay >= 8) {
            totalPay = hoursWorked * basePay;
            System.out.println(name + " " + totalPay);
        }

    }

}


