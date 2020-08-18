package com.qa.day7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MorseCode {
    
    static List<String> alphabet = new ArrayList<>();
    static List<String> morseAlphabet = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(alphabet, "a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        Collections.addAll(morseAlphabet, ".-","-...","-.-.", "-..", ".", "..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        System.out.println(method1("Hello World"));
        System.out.println(method2(".../---/..."));
    }
    
    public static String method1(String morse){
        String[] array = morse.split("",0);
        String myString = "";
        for(String i : array) {
            for (int e = 0; e < alphabet.size(); e++){
                if (i.toUpperCase().equals(alphabet.get(e).toUpperCase())) {
                    myString = myString + morseAlphabet.get(e);
                }
            }
            if(i.equals(" ")){
                myString = myString + "/";
            }
        }
        return myString;
    }
    
    public static String method2(String toMorse){
        String[] myArr = toMorse.split("/",0);
        String myString = "";
        for(String i : myArr) {
            for (int e = 0; e < morseAlphabet.size(); e++){
                if (i.equals(morseAlphabet.get(e))) {
                    myString = myString + alphabet.get(e);
                }
            }
        }
        return myString;
    }
}
