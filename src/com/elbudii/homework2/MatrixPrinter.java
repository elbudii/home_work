package com.elbudii.homework2;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] x = {
            {1, 2, 3, 4},
            {3, 4, 5, 6},
            {7, 5, 4, 1}
        };
        for (int r=0; r < x.length; r++) {
            for (int c=0; c < x[r].length; c++)
                System.out.print(x[r][c] + " ");
            System.out.println();
        }
    }
}
