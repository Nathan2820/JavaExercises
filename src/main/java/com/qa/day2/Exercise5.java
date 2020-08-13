package com.qa.day2;

public class Exercise5 {

    public static void main(String[] args) {
        uniqueSum(2, 2, 5);
        uniqueSum(5, 2, 5);
        uniqueSum(2, 3, 5);
        uniqueSum(3, 5, 5);
        uniqueSum(10, 10, 10);
    }

    public static void uniqueSum(int a, int b, int c) {
        int sum = a;
        if (b != a) {
            sum = sum + b;
        }
        if (c != b && c != a) {
            sum = sum + c;
        }
        if (a == b && a == c) {
            sum = 0;
        }
        System.out.println(sum);
    }

}
