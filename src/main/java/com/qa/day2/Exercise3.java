package com.qa.day2;

public class Exercise3 {

    public static void main(String[] args) {
        input(2333);
        System.out.println();
        input(1999);
        System.out.println();
        input(230);
        System.out.println();
        input(555);
    }

    public static void input(int A) {
        if (A > 2000) {
            System.out.println("A");
            if (A > 6000) {
                System.out.println("C");
            }
            else {
                System.out.println("B");
                if (A > 4000) {
                    System.out.println("D");
                }
                else {
                    System.out.println("E");
                }
            }
        }
        else {
            System.out.println("1");
            if (A > 100) {
                System.out.println("3");
                if (A > 600) {
                    System.out.println("5");
                }
                else {
                    System.out.println("4");
                    if (A > 500) {
                        System.out.println("6");
                    }
                    else {
                        System.out.println("7");
                    }
                }
            }
            else {
                System.out.println("2");
            }
        }
    }

}
