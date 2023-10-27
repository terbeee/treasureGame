import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;
    @BeforeEach
    public void setUp(){
        board = new Board(5,5);
    }

    @Test
    public void testSize(){
        //Is the board spaces calculated correctly?
        assertEquals(25, board.gettSpaces());
    }

    @Test
    public void testTreasure(){
        //Does it generate treasure and can we manipulate its pos
        board.setTresPos(1,1);
        assertEquals(1, board.getTresPosW());
    }



}