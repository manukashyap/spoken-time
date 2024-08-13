package com.smartbear.time.models;

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
