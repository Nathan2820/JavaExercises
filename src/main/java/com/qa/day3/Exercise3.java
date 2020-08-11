package com.qa.day3;

public class Exercise3 {

    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne() {
        int count = 0;
        while(count < 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            count++;
        }
    }
}
