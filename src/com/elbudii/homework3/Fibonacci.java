package com.elbudii.homework3;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int [] Fibonacci = new int [10];
        for (int i = 0; i < Fibonacci.length; i++) {
            if (i < 2) {
                Fibonacci[i] = 1;
            } else {
                Fibonacci[i] = Fibonacci[i - 2] + Fibonacci[i - 1];
            }
        }
            System.out.println(Arrays.toString(Fibonacci));
        System.out.println(Fibonacci[6]);
        }
        }

