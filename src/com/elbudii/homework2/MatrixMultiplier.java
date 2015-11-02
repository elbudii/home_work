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
        if (first[0].length != second.length) {
            System.out.println("Multiply a matrix cannot");
        }
       /* for (int e = 0; e < second.length; e++) {
            for (int i = 0; i < second[e].length; e++) {

            }
        }*/
        int[][] result = new int[first.length][second[0].length];
        for (int e = 0; e < first.length; e++) {
            for (int i = 0; i < second[0].length; i++) {
               int sumElem = 0;

                for (int j = 0; j < first[0].length; j++) {
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

