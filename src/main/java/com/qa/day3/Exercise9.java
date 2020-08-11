package com.qa.day3;

public class Exercise9 {
    public static int[] nums = {10,20,30,40,50,60,70,80,90,100};
    public static int[] numbers = new int[10];

    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

    public static void methodOne() {
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void methodTwo() {
        for(int i = 0; i < 10; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 10;
            System.out.println(numbers[i]);
        }
    }
}
