package com.qa.day2;

public class Exercise5 {

    public static void main(String[] args) {
        uniqueSum(2, 2, 5);
        uniqueSum(5, 2, 5);
        uniqueSum(2, 3, 5);
    }

    public static void uniqueSum(int a, int b, int c) {
        int sum = a;
        if (b != a) {
            sum = sum + b;
        }
        if (c != b && c != a) {
            sum = sum + c;
        }
        System.out.println(sum);
    }

}