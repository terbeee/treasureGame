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
        assertEquals(25, board.gettSpaces());
    }



}