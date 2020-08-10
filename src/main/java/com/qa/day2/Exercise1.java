package com.qa.day2;

public class Exercise1 {
    private static int physics = 100;
    private static int chemistry = 50;
    private static int biology = 150;
    private static int total;

    public static void main(String[] args) {
        showResults();
        showPercentage();
        physics = 50;
        chemistry = 25;
        biology = 10;
        showResults();
        showPercentage();
        physics = 150;
        chemistry = 100;
        biology = 140;
        showResults();
        showPercentage();
    }

    public static void showResults() {
        System.out.println("Physics score = " + physics);
        System.out.println("Chemistry score = " + chemistry);
        System.out.println("Biology score = " + biology);
        total = physics + chemistry + biology;
        System.out.println("Your total score = " + total);
    }

    public static void showPercentage() {
        int percentage = (total * 100) / 450;
        int numOfFails = 0;
        if (physics < 60) {
            numOfFails += 1;
        }
        if(chemistry < 60) {
            numOfFails += 1;
        }
        if(biology < 60) {
            numOfFails += 1;
        }
        if(numOfFails > 0) {
            System.out.println("You have failed, you failed " + numOfFails + " exams. Your overall percentage was: " + percentage + "%");
        }
        else {
            System.out.println("You have passed the exams with a percentage of: " + percentage + "%");
        }
        System.out.println();
    }
}
