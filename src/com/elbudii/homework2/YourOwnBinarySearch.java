package com.elbudii.homework2;

public class YourOwnBinarySearch {
    public static void main(String[] args) {

        int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 17;
        int left = 0;
        int right = array.length - 1;

        int position = (left + right) / 2;
        if (array[position] == element)
            System.out.println(position);
        else {
            while ((array[position] != element) && (left <= right)) {
                if (array[position] > element)
                    right = position - 1;
                else {
                    left = position + 1;
                }
                position = (left + right) / 2;
            }
            if (left <= right)
                System.out.println(position);
            else
            System.out.println("There is no element in the array");
        }
    }
}













