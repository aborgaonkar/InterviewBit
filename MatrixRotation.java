package InterviewBit;

import java.util.Arrays;

/*
*  1 2 3            7 4 1
*  4 5 6            8 5 2
*  7 8 9            9 6 3
* */

public class MatrixRotation {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2},{3,4}};
        int[][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("rotatedMatrix = " + Arrays.deepToString(rotatedMatrix));
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int matrixLength = matrix.length;
        for(int row = 0; row < matrixLength/2; row++){
            for(int col = 0+row; col < matrixLength-1-row; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[matrixLength-1-col][row];
                matrix[matrixLength-1-col][row] = matrix[matrixLength-1-row][matrixLength-1-col];
                matrix[matrixLength-1-row][matrixLength-1-col] = matrix[col][matrixLength-1-row];
                matrix[col][matrixLength-1-row] = temp;
            }
        }
        return matrix;
    }
}
