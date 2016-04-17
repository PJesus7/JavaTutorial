public class TimesTable {
   public static void main (String[] args) {
      int size = 15;    // size of the board

		int maxSize = (int)Math.log10(size*size);  //compute the spaces necessary to have the table lined
												//largest number to fit will be size*size

		//first row
			padding(maxSize, 1);
			System.out.print("* |");
		for (int col = 1; col <= size; col++) {
			padding(maxSize, col);
			System.out.print(col);
		}
		System.out.println();

		//secondrow
		for (int space = 1; space <= maxSize+3; space++)  {
        System.out.print("-");
		}
		for (int col = 1; col <= size; col++) {
			for (int space = 1; space <= maxSize+1; space++)  {
				System.out.print("-");
				}
				System.out.print("-");
		}
		System.out.println("-");

		//table
		for (int row = 1; row <= size; row++) {
			padding(maxSize, row);
			System.out.print(row + " |");
			for (int col = 1; col <= size; col++) {
				padding(maxSize, col*row);
				System.out.print(col*row);
			}
		System.out.println();
      }
   }

    public static void padding(int max, int number){ //aling the table, make the rest spaces
        for (int space = 1; space <= max-(int)Math.log10(number)+1; space++)  {
        System.out.print(" ");
      		}
	}
}