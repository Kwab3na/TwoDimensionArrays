package org.horizoncolumbus.hs;

public class SumOfMatrix {
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;
        int matrix[][] = {{0,1,1},{9,2,4},{9,0,4},{1,2,5}};

        rows = matrix[0].length;
        cols = matrix.length;

        for(int i = 0; i < 4; i++){
            sumCol = 0;
            for(int j = 0; j < sumCol; j++){
                sumCol = sumCol + matrix[j][i];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for(int i = 0; i < 4; i++){
            sumRow = 0;
            for(int j = 0; j < 3; j++) {
                sumRow = sumRow + matrix[i][j];
            }
            System.out.println("Sum of " + " row " + (i+1)  + " = " + (sumRow));
        }
    }
}