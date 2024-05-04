package goit.lecture.fibonacci.iteration;

import goit.lecture.fibonacci.Fibonacci;

public class FibonacciIterative implements Fibonacci {

    /*
    Calculates fibonacci number using iteration
    Time complexity: O(n)
    Space complexity: O(1)
     */
    @Override
    public int calculate(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        if (num == 1 || num == 0) {
            return num;
        }
        int currentNum = 0;
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 2; i <= num; i++) {
            currentNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = currentNum;
        }
        return currentNum;
    }
}
