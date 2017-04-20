package com.petro.p3;

public class PrintArray {

    public static int [] array = {0,1,2,3,4};

    public static void printLeft (){

        for (int i = 0; i < array.length ; i++) {
            for (int j = i; j >= 0 ; j--) {
                System.out.print(array[j]+ " ");
            }
                System.out.println();
        }

    }
    public static void printRight (){

        int kLimit = 0;

        for (int i = 0; i < array.length; i++) {

            kLimit = array.length * 2 - i * 2 - 3;

            for (int k = kLimit; k >= 0 ; k--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 0 ; j--) {
                System.out.print((array[j] + 1) + " ");
            }
            System.out.println();
        }
    }
    public static void printBoth (){

        int kLimit = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i; j >= 0 ; j--) {
                System.out.print(array[j]+ " ");
            }

            kLimit = array.length * 4 - i *4 - 5;

            for (int k = kLimit; k >= 0 ; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0 ; j--) {
                System.out.print((array[j] + 1) + " ");
            }
            System.out.println();
        }

    }

}
