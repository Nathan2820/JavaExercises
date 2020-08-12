package com.qa.day4;

public class Exercise1 {

    public static void main (String[] args) {
        method1(18);
    }

    public static void method1(int startingValue) {
        int count = 2;
        while (startingValue > 1) {
            System.out.println(startingValue);
            if (startingValue % count == 0) {
                startingValue = startingValue / count;
                count = count + 1;
                if (startingValue == 1) {
                    System.out.println(startingValue);
                    System.out.println((count - 1) + "!");
                    break;
                }
            } else {
                System.out.println("None!");
                break;
            }
        }
    }

}
