package goit.lecture.fibonacci.recursion;

import goit.lecture.fibonacci.Fibonacci;

public class FibonacciRecursive implements Fibonacci {


    /*
    Calculates fibonacci number using head recursion
    Time complexity: O(2^n)
    Space complexity: O(n)
     */
    @Override
    public int calculate(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        if (num == 1 || num == 0) {
            return num;
        }
        return calculate(num - 1) + calculate(num - 2);
    }


    /*
    Calculates fibonacci number using tail recursion
    Time complexity: O(n)
    Space complexity: O(n)
     */
    public int calculateTailRecursion(int num, int a, int b) {
        if (num < 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        if (num == 0) {
            return a;
        }
        if (num == 1) {
            return b;
        }
        return calculateTailRecursion(num - 1, b, a + b);
    }
}
