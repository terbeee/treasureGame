import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the width of the board: ");
        int w = myObj.nextInt();

        System.out.println("Enter the height of the board: ");
        int h = myObj.nextInt();

        Game game = new Game(w, h);

        game.gameStart();

    }
}
