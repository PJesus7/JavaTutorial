import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GradesHistogram {
   public static int[] grades;
      // Declare an int array of grades, to be allocated later
   public static int[] bins = new int[10];
      // Declare and allocate an int array for histogram bins.
      // 10 bins for 0-9, 10-19,...., 90-100
      // initializes every element with 0

   public static void main(String[] args) throws FileNotFoundException {
      readGrades("grades.txt");
      computeHistogram();
      printHistogramHorizontal();
      printHistogramVertical();
   }

   // Read the grades from "filename", store in "grades" array.
   // Assume that the inputs are valid.
   public static void readGrades(String filename) throws FileNotFoundException {

         Scanner in = new Scanner(new File(filename));
         int noStudents = in.nextInt();
         grades = new int[noStudents];

         for (int i=0; i < noStudents; i++){
   		grades[i] =  in.nextInt();
	  }
	  }

   // Based on "grades" array, populate the "bins" array.
   public static void computeHistogram() {
	   for (int value : grades){
		   if (value == 100) {
			 bins[9]++;
		   } else {
		   bins[value/10]++;}
	   }
   }

   // Print histogram based on the "bins" array.
   public static void printHistogramHorizontal() {
	   System.out.print(" 0 -  9: ");
	   int j=1;
	   while(j <= bins[0]){
			System.out.print("*");
	  		j++;};
		System.out.println();

	   for (int i=1; i<=8; i++) {
		   System.out.print(i*10 + " - " + (i*10+9) + ": ");
	   	   j=1;
	   	   while(j <= bins[i]){
	   			System.out.print("*");
	  		j++;};
	  		System.out.println();
		}

		System.out.print("90 -100: ");
		j=1;
		while(j <= bins[9]){
			System.out.print("*");
	  	j++;};
		System.out.println();
	   }

	// Print histogram based on the "bins" array.
	public static void printHistogramVertical() {
		//first compute the height of the Histogram
		int max = bins[0];
			   for (int value : bins) {
				if (max < value) {max = value;};
		   		}

		int i=max; int j;
				while(i > 0){
					System.out.print(" ");j=0;
					while (j<=9) {
						if (bins[j]>= i) {System.out.print("*");
						} else {System.out.print(" ");}
						System.out.print("     ");
						j++;
					}
				System.out.println(); i--;
	   		}

	   		System.out.print("0-9  ");
			for (i=1; i<=8; i++) {
				System.out.print(i*10 + "-" + (i*10+9) + " ");
				}
			System.out.println("90-100");
		}


}