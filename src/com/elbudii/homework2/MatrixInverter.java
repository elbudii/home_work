package com.elbudii.homework2;

public class MatrixInverter {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {7, 5, 4, 1}
        };

        int[][] additionalDiagonalInverted= new int[4][4];

        for (int i = array.length - 1; i >= 0; i--) {
            int d = array.length - 1 - i;
            for (int j = array.length - 1; j >= 0; j--) {
                int e = array.length - 1 - j;
                additionalDiagonalInverted[d][e] = array[i][j];
            }
        }
        System.out.println("First variant:");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array.length; c++)
                System.out.print(array[c][r] + " ");
            System.out.println();
        }
        System.out.println("Second variant:");
        for (int r = 0; r < additionalDiagonalInverted.length; r++) {
            for (int c = 0; c < additionalDiagonalInverted[r].length; c++)
                System.out.print(additionalDiagonalInverted[c][r] + " ");
            System.out.println();
        }
    }
}


