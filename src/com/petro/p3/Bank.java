package com.petro.p3;

public class Bank {

    public static int deposit;
    public static int years;
    public static int targetSum;
    public static int currentDeposit;
    public static int rate;
    public static int method;



    public static void countMoney(int startDeposit, int targetDeposit, int rateValue, int methodNumber) {
        currentDeposit = startDeposit;
        targetSum = targetDeposit;
        rate = rateValue;
        method = methodNumber;

        if (rate <= 0) {
            System.out.println("Fatal error: rate can't be less than 0");
            return;
        }

        if (years == 0) {
            deposit = startDeposit;
        }

        if (deposit > targetDeposit) {
            System.out.println("You don't need to put money in the bank!");
            return;
        }

        switch(methodNumber) {
            case 1:
                method1();
                break;
            case 2:
                method2();
                break;
            case 3:
                method3();
                break;
            case 4:
                method4();
                break;
            case 5:
                method5();
                break;
            case 6:
                method6();
                break;
            case 7:
                method7();
                break;
            case 8:
                method8();
                break;
        }

    }

    /**
     *  post condition
     */
    public static void method1(){
        do {
            years++;
            currentDeposit += currentDeposit * rate/100;
        } while (currentDeposit < targetSum);
        printResult();
    }

    /**
     *  break
     */
    public static void method2(){
        do {
            years++;
            currentDeposit += currentDeposit * rate/100;
            if (currentDeposit >= targetSum) {
                break;
            }
        } while (true);
        printResult();

    }

    /**
     *   break with label
     */
    public static void method3(){

        block:
        for (;;) {
            years++;
            currentDeposit += currentDeposit * rate / 100;
            if (currentDeposit >= targetSum) {
                break block;
            }
        }
        printResult();
    }

    /**
     *  return
     */
    public static void method4(){

        for (int i = 1 ;; i++) {
            currentDeposit += currentDeposit * rate / 100;
            if (currentDeposit >= targetSum) {
                years = i;
                printResult();
                return;
            }
        }

    }

    /**
     *    System.exit()
     */
    public static void method5(){

        while (true) {
            years++;
            currentDeposit += currentDeposit * rate/100;
            if (currentDeposit >= targetSum) {
                printResult();
                System.exit(0);
            }
        }

    }

    /**
     *  Recursion
     */
    public static void method6(){

        years++;
        currentDeposit += currentDeposit * rate/100;
        if (currentDeposit >= targetSum) {
            printResult();
            return;
        }
        countMoney(currentDeposit,targetSum,rate, method);

    }
    public static void method7(){

        for (;;) {
            years++;
            currentDeposit += currentDeposit * rate/100;
            if (currentDeposit >= targetSum) {
                break;
            }
        }
        printResult();

    }
    public static void method8(){

        while (currentDeposit < targetSum) {
            years++;
            currentDeposit += currentDeposit * rate/100;
        }
        printResult();

    }

    public static void printResult (){
        System.out.printf( "Start deposit: %6d%n" +
                        "TargetDeposite: %3d%n" +
                        "Rate: %15d%n" +
                        "Years to go: %8d%n" +
                        "Final deposit: %6d%n", deposit, targetSum, rate,
                years, currentDeposit);

    }

}
