package InterviewBit;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] setMatrixZeroes = setMatrixZeroes(matrix);
        System.out.println("SetMatrixZero = " + Arrays.deepToString(setMatrixZeroes));
    }

    private static int[][] setMatrixZeroes(int[][] matrix) {
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for(int row = 0 ; row < matrix.length; row++){
            if(matrix[row][0] == 0){
                isFirstRowZero = true;
                break;
            }
        }

        for(int col = 0 ; col < matrix[0].length; col++){
            if(matrix[0][col] == 0){
                isFirstColZero = true;
                break;
            }
        }

        for(int row = 1 ; row < matrix.length; row++){
            for(int col = 1 ; col < matrix[0].length; col++){
                if(matrix[row][col] == 0){
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for(int row = 1 ; row < matrix.length; row++){
            for(int col = 1 ; col < matrix[0].length; col++){
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }
        }

        if(isFirstColZero){
            for(int row = 0 ; row < matrix.length; row++){
                matrix[row][0] = 0;
            }
        }

        if(isFirstRowZero){
            for(int col = 0 ; col < matrix[0].length; col++){
                matrix[0][col] = 0;
            }
        }
        return matrix;
    }
}
