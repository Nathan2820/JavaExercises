package com.qa.day5Test;

import com.qa.day5.Exercise1;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @BeforeClass
    public static void Initialise(){
        Exercise1.main(null);
    }
    @Test
    public void methodTest(){
        Exercise1 cipher = new Exercise1();
        assertEquals("draziw",cipher.method1("wizard"));
    }
}
