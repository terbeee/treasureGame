import java.util.Random;
public class Game {

    Player player;
    Board board;

    public Game(int w, int h) {
        Random rand = new Random();
        this.board = new Board(w,h);
        int rw = rand.nextInt(w) + 1;
        int rh = rand.nextInt(h) + 1;
        this.player = new Player(rw, rh);

    }

    public static void gameStart(int w, int h){

    }

    public Player getPlayer() {
        return player;
    }

    public Board getBoard() {
        return board;
    }
}
