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

    public int sumOfEven() {
        int sum = 0;
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (isEvenNumber(fibonacciNumbers[i])) {
                sum += fibonacciNumbers[i];
            }
        }
        return sum;
    }

    private boolean isEvenNumber(int fibonacciNumber) {
        if (fibonacciNumber % 2 == 0) {
            return true;
        }
        else return false;
    }
}
