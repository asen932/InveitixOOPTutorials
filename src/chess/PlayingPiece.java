package chess;

public class  PlayingPiece {
   private int x;
   private int y;
   boolean isAlive;

   public void move(int newX, int newY) {

      this.x = newX;
      this.y = newY;

   }

   private boolean moveLegal(int newX, int newY) {

      if (newX < 8 && newY < 8) {
         if (newX >= 0 && newY >= 0) {
            this.x = newX;
            this.y = newY;
            return true;
         }

      }

      return false;
   }

   public int getX () {
      return x;
   }

}
