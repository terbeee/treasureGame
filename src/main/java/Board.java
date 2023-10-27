public class Board {

    private int width;
    private int height;
    private int tSpaces;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.tSpaces = width*height;
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

