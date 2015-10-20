package com.elbudii.homework2;


public class MatrixInverter {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {7, 5, 4, 1}
        };
    /* Your code here */
        int[][] resultat = new int[4][4];
        int[][] resultat2 = new int[4][4];
        int[][] resultat3 = new int[4][4];

        // записываем нашу матрицу задом наперед в результат
        for (int i = array.length-1; i >= 0; i--) {
            int d = array.length-1 - i;
            for (int j = array.length-1; j >= 0; j--) {
                int e = array.length-1 - j;
                resultat[d][e] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //int currElem = array[i][j];
                resultat2[i][j] = array[j][i];
                resultat2[j][i] = array[i][j];
                resultat3[i][j] = resultat[j][i];
                resultat3[j][i] = resultat[i][j];
            }
        }
        System.out.println("First variant:");
        for (int r = 0; r < resultat2.length; r++) {
            for (int c = 0; c < resultat2[r].length; c++)
                System.out.print(resultat2[r][c] + " ");
            System.out.println();
        }
        System.out.println("Second variant:");
        for (int r = 0; r < resultat3.length; r++) {
            for (int c = 0; c < resultat3[r].length; c++)
                System.out.print(resultat3[r][c] + " ");
            System.out.println();
        }
    }
}


