package com.smartbear.time.models;

/**
 * The {@code NumericTime} class represents a specific time of day in terms of hours and minutes.
 * <p>
 * This class is used to store and retrieve the hour and minute components of a time.
 * It provides methods to access the hour and minute values individually.
 * </p>
 * <p>
 * Instances of this class are immutable once created, meaning the hour and minute
 * values cannot be changed after the object has been instantiated.
 * </p>
 */
public class NumericTime {

    private int hour;
    private int minute;

    public NumericTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
