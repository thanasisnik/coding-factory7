package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert days hours minutes seconds to total seconds
 * and print the final result
 */

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        int days = 0;
        int hours = 0;
        int mins = 0;
        int secs = 0;
        int result = 0;

        Scanner in = new Scanner(System.in);
        System.out.println(" Give days, hours, mins and seconds");

        days = in.nextInt();
        hours = in.nextInt();
        mins = in.nextInt();
        secs = in.nextInt();

        result = (days * 24 * 60 * 60) + (hours * 60 *60) + (mins *60) + secs;

        //BETTER SOLUTION WAS TO MAKE THE MAGIC NUMBERS FINAL EXAMPLE FINAL INT SECONDS_PER_HOUR = 3600

        System.out.printf("Total seconds are %d", result);
    }
}
