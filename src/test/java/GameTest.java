import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;



class GameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private Game game;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @BeforeEach
    public void setUp(){
    game = new Game(5,5);
    }

    @Test
    public void testGamePlayer(){
        //Tests that game class correctly generates a player
        game.getPlayer().setPlayerPos(1,1);
        assertEquals(1, game.getPlayer().getPosition()[0][0]);
    }

    @Test
    public void testGameBoard(){
        //Tests that game class correctly generates board object
        assertEquals(25, game.getBoard().gettSpaces());
    }

    @Test
    public void testWinCon(){
        game.getPlayer().setPlayerPos(1,1);
        game.getBoard().setTresPos(1,1);
        assertEquals(true, game.isWin(game.getBoard().getTresPos(), game.getPlayer().getPosition()));
    }


}