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
        if (n != k) {
            System.out.println("Mmultiply a matrix cannot");
        }
        int[][] resultat = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultat[i][j] = first[i][j] * second[j][i];
            }
        }
        for (int r = 0; r < resultat.length; r++) {
            for (int c = 0; c < resultat[r].length; c++)
                System.out.print(resultat[r][c] + " ");
            System.out.println();
        }
    }
}

