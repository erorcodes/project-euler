import java.util.*;

public class Fibonacci {
    private List<Integer> fibonacciNumbers;

    public Fibonacci() {
        fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(2);
    }

    List<Integer> getFibonacciNumbers() {
        return fibonacciNumbers;
    }

    void createBySize(int number) {
        for (int i = 2; i < number; i++) {
            int nextNumber = fibonacciNumbers.get(i-2) + fibonacciNumbers.get(i-1);
            fibonacciNumbers.add(nextNumber);
        }
    }

    void createByMax(int max) {
        int i = 2;
        while (true) {
            int nextNumber = fibonacciNumbers.get(i-2) + fibonacciNumbers.get(i-1);
            if (nextNumber < max) {
                fibonacciNumbers.add(nextNumber);
                i++;
            } else return;
        }
    }

    int sumOfEven() {
        int sum = 0;
        for (int i = 0; i < fibonacciNumbers.size(); i++) {
            if (fibonacciNumbers.get(i) % 2 == 0) {
                sum += fibonacciNumbers.get(i);
            }
        }
        return sum;
    }
}
