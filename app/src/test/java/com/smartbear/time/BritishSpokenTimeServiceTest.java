/*
 * This source file was generated by the Gradle 'init' task
 */
package com.smartbear.time;

import com.smartbear.time.models.NumericTime;
import com.smartbear.time.service.dialects.british.BritishSpokenTimeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BritishSpokenTimeServiceTest {

    private final BritishSpokenTimeService britishSpokenTimeService = new BritishSpokenTimeService();

    @Test
    public void testOneOClock() {
        NumericTime time = new NumericTime(1, 0);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("one o'clock", result);
    }

    @Test
    public void testFivePastTwo() {
        NumericTime time = new NumericTime(2, 5);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("five past two", result);
    }

    @Test
    public void testTenPastThree() {
        NumericTime time = new NumericTime(3, 10);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("ten past three", result);
    }

    @Test
    public void testQuarterPastFour() {
        NumericTime time = new NumericTime(4, 15);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("quarter past four", result);
    }

    @Test
    public void testTwentyPastFive() {
        NumericTime time = new NumericTime(5, 20);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("twenty past five", result);
    }

    @Test
    public void testTwentyFivePastSix() {
        NumericTime time = new NumericTime(6, 25);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("twenty five past six", result);
    }

    @Test
    public void testSixThirtyTwo() {
        NumericTime time = new NumericTime(6, 32);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("six thirty two", result);
    }

    @Test
    public void testHalfPastSeven() {
        NumericTime time = new NumericTime(7, 30);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("half past seven", result);
    }

    @Test
    public void testTwentyFiveToEight() {
        NumericTime time = new NumericTime(7, 35);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("twenty five to eight", result);
    }

    @Test
    public void testTwentyToNine() {
        NumericTime time = new NumericTime(8, 40);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("twenty to nine", result);
    }

    @Test
    public void testQuarterToTen() {
        NumericTime time = new NumericTime(9, 45);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("quarter to ten", result);
    }

    @Test
    public void testTenToEleven() {
        NumericTime time = new NumericTime(10, 50);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("ten to eleven", result);
    }

    @Test
    public void testFiveToTwelve() {
        NumericTime time = new NumericTime(11, 55);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("five to twelve", result);
    }

    @Test
    public void testMidnight() {
        NumericTime time = new NumericTime(0, 0);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("midnight", result);
    }

    @Test
    public void testNoon() {
        NumericTime time = new NumericTime(12, 0);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("noon", result);
    }

    @Test
    public void testSixFortyThree() {
        NumericTime time = new NumericTime(6, 43);
        String result = britishSpokenTimeService.getSpokenTime(time);
        assertEquals("six forty three", result);
    }
}