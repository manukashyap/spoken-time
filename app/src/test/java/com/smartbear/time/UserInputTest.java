package com.smartbear.time;

import com.smartbear.time.exceptions.InvalidTimeException;
import com.smartbear.time.service.io.UserInput;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserInputTest {

    UserInput userInput = UserInput.getInstance();

    @Test
    public void testInvalidTimeFormatMissingColon() {
        InvalidTimeException exception = assertThrows(InvalidTimeException.class, () -> {
            System.setIn(new java.io.ByteArrayInputStream("1230".getBytes()));
            userInput.getNumericTime();
        });
        assertEquals("Time must be in HH:MM format.", exception.getMessage());
    }

    @Test
    public void testInvalidHourRange() {
        InvalidTimeException exception = assertThrows(InvalidTimeException.class, () -> {
            System.setIn(new java.io.ByteArrayInputStream("25:00".getBytes()));
            userInput.getNumericTime();
        });
        assertEquals("Hour must be between 00 and 23.", exception.getMessage());
    }

    @Test
    public void testInvalidMinuteRange() {
        InvalidTimeException exception = assertThrows(InvalidTimeException.class, () -> {
            System.setIn(new java.io.ByteArrayInputStream("12:65".getBytes()));
            userInput.getNumericTime();
        });
        assertEquals("Minute must be between 00 and 59.", exception.getMessage());
    }

    @Test
    public void testInvalidHourFormat() {
        InvalidTimeException exception = assertThrows(InvalidTimeException.class, () -> {
            System.setIn(new java.io.ByteArrayInputStream("ab:30".getBytes()));
            userInput.getNumericTime();
        });

        assertEquals("Hour and minute must be valid integers.", exception.getMessage());
    }

    @Test
    public void testInvalidMinuteFormat() {
        InvalidTimeException exception = assertThrows(InvalidTimeException.class, () -> {
            System.setIn(new java.io.ByteArrayInputStream("12:cd".getBytes()));
            userInput.getNumericTime();
        });
        assertEquals("Hour and minute must be valid integers.", exception.getMessage());
    }
}

