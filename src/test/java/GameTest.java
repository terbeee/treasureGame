import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;
    @BeforeEach
    public void setUp(){
    game = new Game(5,5);
    }

    @Test
    public void testGamePlayer(){
        //Tests that game class correctly generates a player
        game.getPlayer().setPosition(new int[][]{{1},{1}});
        assertEquals(1, game.getPlayer().getPosition()[0][0]);
    }

    @Test
    public void testGameBoard(){
        //Tests that game class correctly generates board object
        assertEquals(25, game.getBoard().gettSpaces());
    }


}