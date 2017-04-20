package com.petro.p3;

public class PrintArray {

    public static int  arraySize = 5;

    public static void printLeft (){

        for (int i = 0; i < arraySize; i++) {
            for (int j = i; j >= 0 ; j--) {
                System.out.print(j+ " ");
            }
                System.out.println();
        }

    }
    public static void printRight (){

        int kLimit = 0;

        for (int i = 1; i <= arraySize ; i++) {

            kLimit = arraySize * 2 - i * 2 - 1;

            for (int k = 0; k <= kLimit ; k++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void printBoth (){

        int kLimit = 0;

        for (int i = 0; i < arraySize ; i++) {
            for (int j = i; j >= 0 ; j--) {
                System.out.print(j + " ");
            }

            kLimit = arraySize * 4 - i *4 - 5;

            for (int k = 0; k <= kLimit ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0 ; j--) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }

    }

}
