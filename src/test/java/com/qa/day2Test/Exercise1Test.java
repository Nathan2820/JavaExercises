package com.qa.day2Test;

import com.qa.day2.Exercise1;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Before
    public void setup() {
        Exercise1.main(null);
    }

    @Test
    public void showResultsTest() {
        assertEquals(390, Exercise1.showResults());
    }

    @Test
    public void showPercentageTest() {
        assertEquals("You have passed the exams with a percentage of: 86%" + "\n", Exercise1.showPercentage());
    }

}
