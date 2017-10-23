import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFirstTenFibonacciNumbers() {
        Fibonacci fibonacci = new Fibonacci(10);
        String a = "[1, 2, 3, 5, 8, 13, 21, 34, 55, 89]";
        assertEquals(a, fibonacci.getNumbersAsString());
    }
}
