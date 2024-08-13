package com.smartbear.time.service.dialects.british;


import com.smartbear.time.enums.NumberSpelling;
import com.smartbear.time.models.NumericTime;
import com.smartbear.time.service.ISpokenTimeService;

public class BritishSpokenTimeService implements ISpokenTimeService {
    public String getSpokenTime(NumericTime numericTime) {
        int hour = numericTime.getHour();
        int minute = numericTime.getMinute();
        if (hour == 0 && minute == 0) {
            return "midnight";
        } else if (hour == 12 && minute == 0) {
            return "noon";
        } else if (minute == 0) {
            return String.format("%s o'clock", NumberSpelling.fromNumber(hour));
        } else if (minute == 15) {
            return String.format("quarter past %s", NumberSpelling.fromNumber(hour));
        } else if (minute == 30) {
            return String.format("half past %s", NumberSpelling.fromNumber(hour));
        } else if (minute == 45) {
            return String.format("quarter to %s", NumberSpelling.fromNumber((hour % 12) + 1));
        } else if (minute < 30 && minute % 5 == 0) {
            return String.format("%s past %s", NumberSpelling.fromNumber(minute), NumberSpelling.fromNumber(hour));
        } else if (minute > 30 && minute % 5 == 0) {
            return String.format("%s to %s", NumberSpelling.fromNumber(60 - minute), NumberSpelling.fromNumber((hour % 12) + 1));
        } else {
            return String.format("%s %s", NumberSpelling.fromNumber(hour % 12), NumberSpelling.fromNumber(minute));
        }
    }
}