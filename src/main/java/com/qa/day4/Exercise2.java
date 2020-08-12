package com.qa.day4;

public class Exercise2 {
    public static void main(String[] args) {
        method1(12);
    }
    public static void method1(int position) {
        for(int i=1; i<=100; i++) {
            if (position == i) {
                continue;
            } else if(i==11){
                System.out.println(i+"th");
            }else if(i==12) {
                System.out.println(i + "th");
            }else if(i==13) {
                System.out.println(i + "th");
            }else if (i % 10 == 2) {
                System.out.println(i + "nd");
            } else if (i % 10 == 3) {
                System.out.println(i + "rd");
            } else if(i%10 ==1 ){
                System.out.println(i +"st");
            } else {
                System.out.println(i + "th");
            }
        }
    }
}
