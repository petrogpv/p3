package com.petro.p3;

public class Statistics {

    private static int sum;
    public static int count;
    public static int maxValue = Integer.MIN_VALUE;
    public static int minValue = Integer.MAX_VALUE;
    public static double averageValue;


    public static void inputNumbers (int ... numbers){

        for (int number : numbers) {
            count ++;
            sum += number;

            if (number >= maxValue) {
                maxValue = number;
            }

            if (number <= minValue){
                minValue = number;
            }

            averageValue = (double) sum/count;
            System.out.print(number +", ");
        }
    }
    public static void printResult (){

        System.out.printf( "Quantity of inputted numbers: %7d%n" +
                        "Max value: %26d%n" +
                        "Min value: %26d%n" +
                        "Average value: %22.3f", count, maxValue, minValue, averageValue);

    }
}
