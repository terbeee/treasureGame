import java.util.Random;

public class Board {

    private int width;
    private int height;
    private int tSpaces;

    private int[][] tresPos;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.tSpaces = width*height;
        Random rand = new Random();
        int tw = rand.nextInt(width)+1;
        int th = rand.nextInt(height)+1;
        this.tresPos = new int[][]{{tw},{th}};

    }

    public int[][] getTresPos() {
        return tresPos;
    }

    public void setTresPos(int w, int h) {
        this.tresPos = new int[][]{{w},{h}};
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int gettSpaces() {
        return tSpaces;
    }

    public void settSpaces(int tSpaces) {
        this.tSpaces = tSpaces;
    }
}

