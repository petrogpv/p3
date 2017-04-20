package com.petro.p3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        digitFinder();      // Task 1
//        statistics();       // Task 2
//        bank(7);             // Task 3
//        printArray();       // Task 4


    }

    public static void digitFinder(){

        int randomNumberResearch = (int)(Math.random()*1000000000);
        int randomDigitFind = (int)(Math.random()*10);

        DigitFinder.findDigit(randomNumberResearch,randomDigitFind);

        System.out.println("\n");
    }

    public static void statistics(){

        int randomNumbersQuantity = (int)(Math.random()*20);
        int number = 0;

        for (int i = 0; i < randomNumbersQuantity; i++) {
            number = (int) (Math.random() * 200 - 100);
            Statistics.inputNumbers(number);
        }

        int [] arr = {5, -6, 90};
        Statistics.inputNumbers(arr);

        System.out.println();

        Statistics.printResult();

        System.out.println("\n");
    }
    public static void bank(int methodNumber){

        int deposit = 1000;
        int targetDeposit = 10000;
        int rate = 100;

        Bank.countMoney(deposit,targetDeposit,rate, methodNumber);

    }
    public static void printArray(){

        PrintArray.printLeft();
        PrintArray.printRight();
        PrintArray.printBoth();
    }



    }
