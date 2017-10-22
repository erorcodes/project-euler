package p001;

public class Multiplier {
    private int answer = 1;

    public int answer() {
        return answer;
    }

    public void multiply(int from, int to) {
        answer = answer * from * to ;
    }
}
