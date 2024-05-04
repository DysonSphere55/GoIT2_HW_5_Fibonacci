package goit.lecture.fibonacci.iteration;

import goit.lecture.fibonacci.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciIterativeTest {

    private Fibonacci fib;
    @BeforeEach
    void setUp() {
        fib = new FibonacciIterative();
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 0", "1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21"})
    void calculateShouldReturnCorrectFibonacciNumber(int passedValue, int expectedValue) {
        int actualValue = fib.calculate(passedValue);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void calculateShouldThrowIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fib.calculate(-1));
    }
}
