package com.practice;

public class StairProblem {
    public static void main(String[] args) {
        int numStairs = 12;
        createStairs(numStairs);
    }

    private static void createStairs(int numStairs) {
        for(int i = 1 ; i < numStairs; i++){
            for(int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
