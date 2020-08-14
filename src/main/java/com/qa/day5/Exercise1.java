package com.qa.day5;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exercise1 {
    static List<String> english = new ArrayList<>();
    static List<String> cipher = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(english,"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        Collections.addAll(cipher,"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        Collections.reverse(cipher);
        System.out.println(cipher);
        method1("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi ");
    }
    public static String method1(String letter) {
        String[] array = letter.split("",0);
        String test = "";
        for (String value : array) {
            for (int i = 0; i < english.size(); i++) {
                if (value.equals(english.get(i))) {
                    test = test + cipher.get(i);
                }
            }
            if(value.equals(" ")){
                test = test.concat(" ");
            }
        }
        System.out.println(test);
        return test;
    };
}