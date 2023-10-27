public class Player {
    private int[][] position;

    public Player(int w, int h) {
        this.position = new int[][]{{w},{h}};
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
}
