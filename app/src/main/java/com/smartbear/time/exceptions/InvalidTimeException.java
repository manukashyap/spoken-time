package com.smartbear.time.exceptions;

/**
 * The {@code InvalidTimeException} class represents an exception that is thrown
 * when an invalid time is encountered.
 * <p>
 * This exception is typically used to indicate that a time provided by the user
 * or parsed from a string is not in the correct format, or falls outside the valid
 * range for hours (0-23) and minutes (0-59).
 * </p>
 */
public class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}