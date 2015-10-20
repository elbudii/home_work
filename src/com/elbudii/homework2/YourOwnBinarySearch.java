package com.elbudii.homework2;

public class YourOwnBinarySearch {
    public static void main(String[] args) {

        int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 10;
        int n = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                System.out.println("Index of the element " + index);
                n = 1;
            }
        }
        if (n == 0)
            System.out.println("-1");
    }

}





