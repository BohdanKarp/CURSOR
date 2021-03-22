package com.BohdanKarp;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    /*
          Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).
    */
    static void sortReverse(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sort Reverse: " + Arrays.toString(array));
    }
    /*
            You get an array of numbers(should contain both positive and negative numbers),
            and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)
    */
    static void sumPositive(int[] array) {
        int sumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumPositive += array[i];
            }
        }
        System.out.println("Sum positive element array: " + sumPositive);
    }
    /*
        You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)
    */
    static void averageArray(int[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;
        System.out.println("Average array: " + avg);
    }
    /*
        You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0.
        Result should be  next: {3,2,0,1,4,0,8,0}
    */
    static void replaceDuplicated(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        System.out.println("Replace Duplicated: " + Arrays.toString(array));
    }
    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        int[] arrayTest = {-8, 0, 3, 2, 7, 55, -5, 2, -33};
        sortReverse(array);
        sumPositive(arrayTest);
        averageArray(arrayTest);
        replaceDuplicated(arrayTest);
    }
}
