package com.elbudii.homework3;

public class FibonacciRecursion {

    public static int fibonachi(int n) {

         if (n < 2)
             return 1;
          else {
             return fibonachi(n - 2) + fibonachi(n - 1);
         }
     }

    public static void main(String[] args) {

        System.out.println(fibonachi(6));
    }
    }




