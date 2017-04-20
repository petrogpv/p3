package com.petro.p3;

public class DigitFinder {

    static void findDigit(int number, int digit) {

        int num = number;
        int currentDigit = 0;
        int encounteredDigits = 0;
        boolean notEnd = true;

        do {
            currentDigit = num % 10;

            if (digit == currentDigit) {
                encounteredDigits++;
            }

            num /= 10;

            if (num == 0) {
                notEnd = false;
            }

        } while (notEnd);

        System.out.printf("Research number: %20d%n" +
                "Digit to find: %22d%n" +
                "Encountered digit times: %12d%n", number, digit, encounteredDigits);

    }
}
