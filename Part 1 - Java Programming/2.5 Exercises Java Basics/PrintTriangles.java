import java.util.Scanner;

public class PrintTriangles {
	public static int maxSize1;

   public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number of rows:");
	int numRows = in.nextInt();

	maxSize1 = (int)Math.log10(Math.pow(2,numRows-1));
	printPowerOf2Triangle(numRows);

	printPascalTriangle1(numRows);
   }

    public static void padding(int max, int number){ //aling the table, make the rest spaces
        for (int space = 1; space <= max-(int)Math.log10(number)+1; space++)  {
        System.out.print(" ");
      		}
	}

	 public static void printPowerOf2Triangle(int size) {
		for (int i=0; i <= size-1; i++) {
		   for (int j=0; j<=2*size - 1; j++) {
			    int num = (int)Math.pow(2,(i-Math.abs(j-size)));
				if (j>=size-i && j<=size+i) {
					padding(maxSize1,num);System.out.print(num);
				} else {
					padding(maxSize1,1); System.out.print(" ");}
				}
				System.out.println();
			}
	}

   public static void printPascalTriangle1(int size) {
	   for (int i=1; i <= size; i++) {
		 int m = 1;
	   		for (int j=1; j<=i; j++) {
				System.out.print(m + " ");
				m = m * (i-j)/j;
			}
			System.out.println();
		}
	}
}