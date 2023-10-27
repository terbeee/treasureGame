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

   public void playerUp(){
      this.position[1][0] += 1;
   }
   public void playerDown(){
       this.position[1][0] -= 1;
   }
   public void playerLeft(){
       this.position[0][0] -= 1;
   }
   public void playerRight(){
       this.position[0][0] += 1;
   }

}
