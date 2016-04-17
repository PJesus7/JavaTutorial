import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class readGrades {
   public static int[] grades;
      // Declare an int array of grades, to be allocated later
   public static int[] bins = new int[10];
      // Declare and allocate an int array for histogram bins.
      // 10 bins for 0-9, 10-19,...., 90-100

   public static void main(String[] args) throws FileNotFoundException {
      readGrades("grades.txt");
   for (int value: grades){
	   System.out.println(value);}
}

   // Read the grades from "filename", store in "grades" array.
   // Assume that the inputs are valid.
   public static void readGrades(String filename) throws FileNotFoundException {

      Scanner in = new Scanner(new File(filename));
      int noStudents = in.nextInt();
      grades = new int[noStudents];

      for (int i=0; i < noStudents; i++){
		grades[i] =  in.nextInt();
	  }}
}
