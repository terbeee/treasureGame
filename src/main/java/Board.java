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

    public int getTresPosW() {
        return tresPos[0][0];
    }

    public int getTresPosH(){
        return tresPos[1][0];
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

