package goit.lecture.fibonacci.recursion;

import goit.lecture.fibonacci.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciRecursiveTest {

    private Fibonacci fib;
    @BeforeEach
    void setUp() {
        fib = new FibonacciRecursive();
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 0", "1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21"})
    void calculateShouldReturnCorrectFibonacciNumber(int passedValue, int expectedValue) {
        int actualValue = fib.calculate(passedValue);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 0", "1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21"})
    void calculateTailRecursionShouldReturnCorrectFibonacciNumber(int passedValue, int expectedValue) {
        FibonacciRecursive fib = new FibonacciRecursive();
        int actualValue = fib.calculateTailRecursion(passedValue, 0, 1);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void calculateShouldThrowIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fib.calculate(-1));
    }

    @Test
    void calculateTailRecursionShouldThrowIllegalArgumentException() {
        FibonacciRecursive fib = new FibonacciRecursive();
        Assertions.assertThrows(IllegalArgumentException.class, () -> fib.calculateTailRecursion(-1, 0, 1));
    }
}
