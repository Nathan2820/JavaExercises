package com.qa.day4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise3 {

    static List<Integer> chairWeight = new ArrayList<>();
    static List<Integer> porridgeTemp = new ArrayList<>();
    static List<Integer> myAcceptedChairs = new ArrayList<>();
    public static int goldiWeight = 100;
    public static int goldiTemp = 80;

    public static void main(String[] args) {
        Collections.addAll(chairWeight, 150, 120, 160, 80, 50, 25,120);
        Collections.addAll(porridgeTemp, 90, 60, 120, 80, 125, 15,70);
        getChairs();
    }
    public static void getChairs() {
        for (int i = 0; i < chairWeight.size(); i++){
            if ((goldiWeight <= chairWeight.get(i)) && (porridgeTemp.get(i) <= goldiTemp)) {
                System.out.println(chairWeight.get(i));
                System.out.println(porridgeTemp.get(i));
                myAcceptedChairs.add(i);
            }
        }
        System.out.println(myAcceptedChairs);
    }

}
