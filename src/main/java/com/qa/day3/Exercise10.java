package com.qa.day3;
import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
    public static List<String> ingredients = new ArrayList<>();

    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne() {
        ingredients.add("mayo");
        ingredients.add("egg");
        ingredients.add("lettuce");
        System.out.println(ingredients);
    }

}
