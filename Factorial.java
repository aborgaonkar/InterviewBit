package com.practice;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("result = " + result);
    }

    private static int factorial(int num) {
        if (num == 1)
            return 1;
        return num * factorial(num-1);
    }
}
