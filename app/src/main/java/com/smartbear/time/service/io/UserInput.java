package com.smartbear.time.service.io;

import com.smartbear.time.exceptions.InvalidTimeException;
import com.smartbear.time.models.NumericTime;

import java.util.Scanner;

public class UserInput {

    private static UserInput instance;
    private UserInput() {
    }

    public static synchronized UserInput getInstance() {
        if (instance == null) {
            instance = new UserInput();
        }
        return instance;
    }

    /**
     * Prompts the user to enter a time in the format "HH:MM" and returns
     * a {@link NumericTime} object representing the entered time.
     *
     * <p>This method reads the time input from the user, splits the input string
     * into hours and minutes, and then parses these values as integers.
     * A {@link NumericTime} object is created using the parsed hour and minute
     * values, and returned to the caller.</p>
     *
     * @return a {@link NumericTime} object containing the hour and minute
     *         entered by the user.
     * @throws InvalidTimeException if the input does not contain a valid time.
     * @see NumericTime
     */
    public NumericTime getNumericTime() throws InvalidTimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (HH:MM): ");
        String time = scanner.nextLine();

        String[] parts = time.split(":");

        if (parts.length != 2) {
            throw new InvalidTimeException("Time must be in HH:MM format.");
        }

        try {
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);

            if (hour < 0 || hour > 23) {
                throw new InvalidTimeException("Hour must be between 00 and 23.");
            }

            if (minute < 0 || minute > 59) {
                throw new InvalidTimeException("Minute must be between 00 and 59.");
            }

            return new NumericTime(hour, minute);

        } catch (NumberFormatException e) {
            throw new InvalidTimeException("Hour and minute must be valid integers.");
        }
    }
}
