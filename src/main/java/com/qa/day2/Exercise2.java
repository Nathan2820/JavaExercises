package com.qa.day2;

public class Exercise2 {

    public static void main(String[] args) {
        performSum(true, 12, 13);
        performSum(true, 300, 45);
        performSum(false, 10, 4);
    }

    public static void performSum(boolean a, int b, int c) {
        if (a) {
            System.out.println("The sum of the two numbers = " + (b + c));
        }
        else {
            System.out.println("The two numbers multiplied = " + (b * c));
        }
    }

}
