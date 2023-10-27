import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;
    @BeforeEach
    public void setUp(){
        player = new Player(2,7);
    }

    @Test
    public void testClass(){
        int[][] p = player.getPosition();
        assertEquals(2, p[0][0]);
        assertEquals(7, p[1][0]);

    }

}