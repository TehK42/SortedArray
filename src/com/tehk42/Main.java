package com.tehk42;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int numbers) {
        int[] values = new int[numbers];
        System.out.println("Enter " + numbers + " integer values.\r");
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is equal to " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}
//        int[] sortedArray = new int[array.length];
//        for(int i= 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
//        for(int i = 0; i < sortedArray.length; i++) {
//            for(int j = i + 1; j < sortedArray.length; j++) {
//                if(sortedArray[i] < sortedArray[j]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[j];
//                    sortedArray[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Array elements in descending order:");
//        for(int i = 0; i < sortedArray.length; i++) {
//            System.out.println(sortedArray[i]);
//        }