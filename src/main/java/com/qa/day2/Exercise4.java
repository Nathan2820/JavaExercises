package com.qa.day2;

public class Exercise4 {

    public static void main(String[] args) {
        blackjack(12, 16);
        blackjack(23, 19);
        blackjack(25, 22);
        blackjack(0, 21);
        blackjack(21, 1);
    }

    public static void blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            System.out.println(0);
        }
        else if (a > 21 && (b < 21 && b > 0)) {
            System.out.println(b);
        }
        else if (b > 21 && (a < 21 && a > 0)) {
            System.out.println(a);
        }
        else if((21 - b > 21 - a)) {
            System.out.println(a);
        }
        else if((21 - a > 21 - b)) {
            System.out.println(b);
        }
        else {
            System.out.println(0);
        }
    }
}
