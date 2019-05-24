package com.griddynamics;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CounterTest {

    private Counter wordCounter = new Counter();

    private static final String INPUT = "Let's do it 100 and 1 times !!!";

    @Test
    public void getCountOfSpecialCharInTest() {
        assertEquals(4, wordCounter.getCountOfSpecialCharIn(INPUT));
    }

    @Test
    public void getCountOfSpacesInTest() {
        assertEquals(7, wordCounter.getCountOfSpacesIn(INPUT));
    }

    @Test
    public void getCountOfNumbersIn() {
        assertEquals(2, wordCounter.getCountOfNumbersIn(INPUT));
    }

    @Test
    public void getCountOfWordsIn() {
        assertEquals(4, wordCounter.getCountOfWordsIn(INPUT));
    }
}