package p001;

public class Multiples {
    private int answer = 0;

    public int answer() {
        return answer;
    }

    public void addMultiples(int belowNumber) {
        for (int i = 0; i < belowNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                    answer += i;
            }
        }
    }
}
