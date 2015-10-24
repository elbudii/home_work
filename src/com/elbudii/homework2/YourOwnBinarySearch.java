package com.elbudii.homework3;

import java.util.Arrays;

public class YourOwnBinarySearch {
    public static void main(String[] args) {

        int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 10;

                System.out.println("Array elements:");
                System.out.println(Arrays.toString(array));

            int index = Arrays.binarySearch(array, element);
            System.out.println("The index of the element 10 = " + index);
        }
    }











