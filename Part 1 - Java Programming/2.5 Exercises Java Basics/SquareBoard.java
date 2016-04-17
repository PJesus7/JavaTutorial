public class SquareBoard {   // saved as "SquareBoard.java"
   public static void main (String[] args) {
      int size = 10;    // size of the board
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            System.out.print("# ");
         }
         System.out.println();
      }
   }
}