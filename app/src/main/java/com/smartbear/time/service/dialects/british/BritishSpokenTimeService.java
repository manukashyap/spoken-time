package com.smartbear.time.service.dialects.british;


import com.smartbear.time.enums.NumberSpelling;
import com.smartbear.time.models.NumericTime;
import com.smartbear.time.service.ISpokenTimeService;

/**
 * The {@code BritishSpokenTimeService} class implements the {@link ISpokenTimeService} interface
 * and provides functionality to convert numeric time into its British spoken equivalent.
 * <p>
 * This service converts time given in hours and minutes into a spoken form commonly used
 * in British English, such as "quarter past four", "ten to eleven", "midnight", or "noon".
 * It handles special cases such as full hours, half past the hour, quarter past, and quarter to the hour.
 * </p>
 */
public class BritishSpokenTimeService implements ISpokenTimeService {

    /**
     * Converts a {@link NumericTime} object into its British spoken time equivalent.
     * <p>
     * The method converts the given time to a human-readable spoken format commonly used in British English.
     * It handles various cases including:
     * <ul>
     *     <li>Exact hours (e.g., "1:00" to "one o'clock")</li>
     *     <li>Half past the hour (e.g., "7:30" to "half past seven")</li>
     *     <li>Quarter past and quarter to the hour (e.g., "4:15" to "quarter past four", "9:45" to "quarter to ten")</li>
     *     <li>Times before and after the half-hour mark (e.g., "5:20" to "twenty past five", "8:40" to "twenty to nine")</li>
     *     <li>Exact spoken equivalents of "midnight" and "noon"</li>
     *     <li>Exact minutes when not on a 5-minute interval (e.g., "6:32" to "six thirty two")</li>
     * </ul>
     * </p>
     *
     * @param numericTime The {@link NumericTime} object containing the hour and minute to be converted.
     * @return A string representing the British spoken equivalent of the provided time.
     */
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