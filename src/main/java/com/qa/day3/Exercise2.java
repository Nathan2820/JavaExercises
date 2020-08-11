package com.qa.day3;

public class Exercise2 {

    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne() {
        for(int A = 100; A <= 200; A++) {
            if (A%2 == 0) {
                System.out.println("-");
            }
            else {
                System.out.println("*");
            }
        }
    }
}
