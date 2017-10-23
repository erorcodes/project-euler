import java.util.Arrays;

public class Fibonacci {
    private int[] fibonacciNumbers;

    public Fibonacci(int size) {
        fibonacciNumbers = new int[size];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 2;
        int firstNumber = 1;
        int secondNumber = 2;
        int newNumber;
        for (int i = 2; i < size; i++) {
            newNumber = firstNumber + secondNumber;
            fibonacciNumbers[i] = newNumber;
            firstNumber = secondNumber;
            secondNumber = newNumber;
        }
    }

    public int[] getNumbers() {
        return fibonacciNumbers;
    }

    public String getNumbersAsString() {
        return Arrays.toString(fibonacciNumbers);
    }
}
