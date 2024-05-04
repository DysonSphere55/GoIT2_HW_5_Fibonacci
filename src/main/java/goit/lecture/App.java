package goit.lecture;

import goit.lecture.fibonacci.Fibonacci;
import goit.lecture.fibonacci.dynamic_programming.FibonacciDynamically;
import goit.lecture.fibonacci.iteration.FibonacciIterative;
import goit.lecture.fibonacci.recursion.FibonacciRecursive;


public class App {
    public static void main( String[] args ) {

        Fibonacci fibIterative = new FibonacciIterative();
        System.out.println("fibIterative.calculate(7) = " + fibIterative.calculate(7));

        Fibonacci fibRecursive = new FibonacciRecursive();
        System.out.println("fibRecursive.calculate(7) = " + fibRecursive.calculate(7));

        Fibonacci fibDynamically = new FibonacciDynamically();
        System.out.println("fibDynamically.calculate(7) = " + fibDynamically.calculate(7));
    }
}
