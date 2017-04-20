package com.petro.p3;

public class DigitFinder {

    static void findDigit(int number, int digit) {

        int num = number;
        int encounteredDigits = 0;

        do {
            if (num %10 == digit) {
                encounteredDigits++;
            }

            num /= 10;

        } while (num != 0);

        System.out.printf("Research number: %20d%n" +
                "Digit to find: %22d%n" +
                "Encountered digit times: %12d%n", number, digit, encounteredDigits);

    }
}
