package chessVratsa;

public class  PlayingPiece {

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   public boolean isAlive() {
      return isAlive;
   }

   private int x;
   private int y;
   private boolean isAlive;

   public PlayingPiece(int x, int y) {
      this.x = x;
      this.y = y;
      this.isAlive = true;

   }

   public void move(int newX, int newY) {

      this.x = newX;
      this.y = newY;

   }

   private boolean moveLegal(int newX, int newY) {

      while (isAlive = true) {

         if (newX < 8 && newY < 8) ;
         {
            if (newX >= 0 && newY >= 0) {
               this.x = newX;
               this.y = newY;
               return true;
            }
            return false;
         }
      }
      return false;
   }

   private void setX(int x) {

      this.x = x;
   }

   private void setY(int y) {

      this.y = y;
   }
}

