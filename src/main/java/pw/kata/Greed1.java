package pw.kata;

import java.util.Arrays;

public class Greed1 {

    public static int greedy(int[] dice) {

        return Arrays.stream(dice).sorted()
                .mapToObj(x -> new DiceScore(x))
                .reduce(new DiceScore(0), (a, b) -> a.add(b))
                .score;
    }
}

class DiceScore {
    int score;
    int value;
    int count;

    public DiceScore(int value) {
        this.value = value;
        this.count = 1;
        this.score = scoreSingle();
    }

    private int scoreSingle() {
        if (value == 1) {
            return 100;
        }
        if (value == 5) {
            return 50;
        }
        return 0;
    }

    public void increase() {
        this.count++;
        this.score += scoreSingle();
        if (count == 3) {
            this.score += scoreTriple();
        }
    }

    private int scoreTriple() {
        if (value == 1) {
            return 700;
        }
        if (value == 5) {
            return 350;
        }

        return value * 100;
    }

    public DiceScore add(DiceScore b) {
        if (value == b.value) {
            increase();
            return this;
        } else {
            b.score += score;
            return b;
        }
    }
}

