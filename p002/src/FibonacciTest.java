import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }
    @Test
    public void testTwoFirstFibonacciNumbers() {
        String oneAndTwo = "[1, 2]";
        assertEquals(oneAndTwo, fibonacci.getFibonacciNumbers().toString());
    }

    @Test
    public void testCalculationOfNextFibonacci() {
        fibonacci.createBySize(3);
        assertTrue(fibonacci.getFibonacciNumbers().get(2).equals(3));
    }

    @Test
    public void testSizeOfList() {
        fibonacci.createBySize(100);
        assertTrue(fibonacci.getFibonacciNumbers().size() == 100);
    }
    @Test
    public void testFirst10Numbers() {
        fibonacci.createBySize(10);
        assertEquals("[1, 2, 3, 5, 8, 13, 21, 34, 55, 89]", fibonacci.getFibonacciNumbers().toString());
    }

    @Test
    public void testAdditionOfEvenNumbers() {
        fibonacci.createBySize(10);
        assertEquals(44, fibonacci.sumOfEven());
    }

    @Test
    public void testNumbersSmallerThan20() {
        fibonacci.createByMax(20);
        assertEquals("[1, 2, 3, 5, 8, 13]", fibonacci.getFibonacciNumbers().toString());
    }

    @Test
    public void testSumOfEvenNumbersSmallerThan20() {
        fibonacci.createByMax(20);
        assertEquals(10, fibonacci.sumOfEven());
    }

    @Test
    public void testSumOfEvenNumbersSmallerThan4million() {
        fibonacci.createByMax(4000000);
        assertEquals(4613732, fibonacci.sumOfEven());
    }
}
