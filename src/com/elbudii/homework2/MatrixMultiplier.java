package com.elbudii.homework2;


public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        int m = first.length;
        int n = first[0].length;
        int k = second.length;
        int l = second[0].length;
        if (n != k) {
            System.out.println("Multiply a matrix cannot");
        }
        int[][] result = new int[m][l];
        for (int e = 0; e < m; e++) {
            for (int i = 0; i < l; i++) {
               int sumElem = 0;

                for (int j = 0; j < n; j++) {
                    sumElem += ((first[e][j] * second[j][i]));
                    result[e][i] = sumElem;
                }
            }
        }
        for (int r = 0; r < result.length; r++) {
            for (int c = 0; c < result[r].length; c++)
                System.out.print(result[r][c] + " ");
            System.out.println();
        }
    }
}

