package com.qa.day3;

public class Exercise4 {

    public static void main(String[] args) {
        methodOne(2);
        System.out.println();
        methodOne(10);
        System.out.println();
        methodOne(5);
    }

    public static void methodOne(int noOfTimes) {
        int count = 0;
        while(count < noOfTimes) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            count++;
        }
    }
}
