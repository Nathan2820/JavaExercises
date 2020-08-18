package com.qa.day7Test;

import org.junit.Test;
import static org.junit.Assert.*;
import com.qa.day7.MorseCode;

public class MorseCodeTest {

    @Test
    public void method1Test() {
        MorseCode morseCode = new MorseCode();
        assertEquals(morseCode.method1("hello"), "......-...-..---");
    }
    @Test
    public void method2Test() {
        MorseCode morseCode = new MorseCode();
        assertEquals(morseCode.method2("...././.-../.-../---"), "hello");
    }
}