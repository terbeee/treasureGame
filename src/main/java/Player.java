public class Player {
    private int[][] position;

    public Player(int w, int h) {
        this.position = new int[][]{{w},{h}};
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPlayerPos(int w, int h) {
        this.position = new int[][]{{w},{h}};
    }
}
