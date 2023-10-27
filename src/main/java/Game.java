import java.util.*;
public class Game {

    Player player;
    Board board;

    public Game(int w, int h) {
        Random rand = new Random();
        this.board = new Board(w,h);

        int rw = rand.nextInt(w) + 1;
        int rh = rand.nextInt(h) + 1;
        while(this.board.getTresPos()[0][0] == rw && this.board.getTresPos()[1][0] == rh){ //Ensures the player doesn't spawn on top of the treasure
            rw = rand.nextInt(w) + 1;
            rh = rand.nextInt(h) + 1;
        }
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

    public boolean isWin(int[][] playerPos, int[][] tresPos){
        return Arrays.deepEquals(playerPos, tresPos);

    }
}
