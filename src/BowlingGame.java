/**
 * Created by npell on 15/07/2015.
 */
public class BowlingGame {

    private int score =0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
