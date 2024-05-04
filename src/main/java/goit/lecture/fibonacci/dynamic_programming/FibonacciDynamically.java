package goit.lecture.fibonacci.dynamic_programming;

import goit.lecture.fibonacci.Fibonacci;

import java.util.HashMap;

public class FibonacciDynamically implements Fibonacci {

    private final HashMap<Integer, Integer> memo;

    public FibonacciDynamically() {
        this.memo = new HashMap<>();
        memo.put(0, 0);
        memo.put(1, 1);
    }


    /*
    Calculates fibonacci number using top-down approach (memoization)
    Time complexity: O(n)
    Space complexity: O(n)
     */
    @Override
    public int calculate(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        if (!memo.containsKey(num)) {
            memo.put(num, calculate(num - 1) + calculate(num - 2));
        }
        return memo.get(num);
    }


    /*
    Calculates fibonacci number using bottom-up approach (tabulation)
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public int calculateWithTabulation(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        HashMap<Integer, Integer> table = new HashMap<>();
        table.put(0, 0);
        table.put(1, 1);
        for (int i = 2; i <= num; i++) {
            table.put(i, table.get(i - 1) + table.get(i - 2));
        }
        return table.get(num);
    }


}
