import java.util.*;
public class Game {

    Player player;
    Board board;

    Monster Wesker;
    Monster Nemesis;

    public Game(int w, int h) {

        this.board = new Board(w,h);

        int rh = randH();
        int rw = randW();
        while(this.board.getTresPos()[0][0] == rw && this.board.getTresPos()[1][0] == rh){
            rw = randW();
            rh = randH();
        }

        this.Wesker = new Monster(rw, rh, "Wesker", "'Poor performance indeed.'");

        //"If I Had More Time, I Would Have Written a Shorter Letter" - Blaire Pascal
        //AKA this spawning method sucks, refactor in future
        rw = randW();
        rh = randH();
        while(this.board.getTresPos()[0][0] == rw && this.board.getTresPos()[1][0] == rh && this.Wesker.getPosition()[0][0] == rw && this.Wesker.getPosition()[1][0] == rh){
            rw = randW();
            rh = randH();
        }
        this.Nemesis = new Monster(rw, rh, "Nemesis", "'S.T.A.R.S'");

        rw = randW();
        rh = randH();
        while(this.board.getTresPos()[0][0] == rh && this.board.getTresPos()[1][0] == rh && this.Wesker.getPosition()[0][0] == rw && this.Wesker.getPosition()[1][0] == rh && this.Nemesis.getPosition()[0][0] == rw && this.Nemesis.getPosition()[1][0] == rh){
            rw = randW();
            rh = randH();
        }
        this.player = new Player(rw, rh);
    }

    public int randW(){
        Random rand = new Random();
        return rand.nextInt(board.getWidth()) + 1;
    }
    public int randH(){
        Random rand = new Random();
        return rand.nextInt(board.getHeight()) + 1;
    }

    public Player getPlayer() {
        return player;
    }

    public Board getBoard() {
        return board;
    }

    public boolean isWin(int[][] playerPos, int[][] tresPos){ //checks if player has found treasure
        return Arrays.deepEquals(playerPos, tresPos);
    }

    public void movePlayer(String move){
    move = move.toUpperCase();

    switch (move){
        case "UP":
            player.playerUp();
            break;
        case "DOWN":
            player.playerDown();
            break;
        case "LEFT":
            player.playerLeft();
            break;
        case "RIGHT":
            player.playerRight();
            break;

        default:
            System.out.println("Invalid move");
    }

    }

    public int getDistW(){
        return board.getTresPos()[0][0] - player.getPosition()[0][0];
    }

    public int getDistH(){
        return board.getTresPos()[1][0] - player.getPosition()[1][0];
    }

    public void gameStart(){
        System.out.println("Welcome to the game!\nYou are at position " + Arrays.deepToString(player.getPosition()));
        boolean gameOver = false;
        Scanner myObj = new Scanner(System.in);
        int distW;
        int distH;
        String move;
        System.out.println("Wesker: " + Arrays.deepToString(Wesker.getPosition()));
        System.out.println("Nemesis: " + Arrays.deepToString(Nemesis.getPosition()));
        System.out.println("Treasure: " + Arrays.deepToString(board.getTresPos()));

        while (!gameOver){
            if (Arrays.deepEquals(player.getPosition(), Wesker.getPosition())){
                System.out.println(Wesker.getGreeting());
                System.out.println("Oh no! " + Wesker.getName() + " caught you, game over.");
                gameOver = true;
            } else if ((Arrays.deepEquals(player.getPosition(), Nemesis.getPosition()))){
                System.out.println(Nemesis.getGreeting());
                System.out.println("Oh no! " + Nemesis.getName() + " caught you, game over.");
                gameOver = true;
            } else if (isWin(player.getPosition(), getBoard().getTresPos())) {
                System.out.println("You found the treasure! You win!");
                gameOver = true;
            } else {
                distH = getDistH();
                distW = getDistW();
                if (distH < 0){
                    System.out.println("The treasure is " + distH *-1 + " steps down");
                } else {
                    System.out.println("The treasure is " + distH + " steps up");
                }

                if (distW < 0){
                    System.out.println("The treasure is " + distW*-1 + " steps left");
                } else {
                    System.out.println("The treasure is " + distW + " steps right");
                }

                System.out.print("Enter your move (UP, DOWN, LEFT, RIGHT): ");
                move = myObj.nextLine();
                movePlayer(move);
            }




        }

    }


}
