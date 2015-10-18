package com.elbudii.homework1;

/**
 * Created by Elena on 14.10.2015.
 */
public class ConditionExemples {
    public static void main(String[] args) {
        int first = -10;

        if (first >= 0) {
            System.out.println("first is positive");
        } else {
            System.out.println("first is negative");
        }
        String result = first >= 0 ? "positive" : "negative";
        System.out.println("first is " + result);
    }
}