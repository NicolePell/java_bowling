import junit.framework.TestCase;

/**
 * Created by npell on 15/07/2015.
 */

public class BowlingGameTest extends TestCase {
    public void testGutterGame() throws Exception {
        BowlingGame game = new BowlingGame();

        for (int i = 0; i < 20; i++)
            game.roll(0);
        assertEquals(0, game.score());
    }

    public void testAllOnes() throws Exception {
        BowlingGame game = new BowlingGame();

        for(int i = 0; i < 20; i++)
            game.roll(1);
        assertEquals(20, game.score());
    }


}
