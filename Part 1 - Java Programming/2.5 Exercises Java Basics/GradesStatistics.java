import java.util.Scanner;

public class GradesStatistics {
   public static int[] grades;  // Declare an int[], to be allocated later

   // main() method
   public static void main(String[] args) {
      readGrades();
      System.out.println("The average is " + average());
      System.out.println("The minimum is " + min());
      System.out.println("The maximum is " + max());
      System.out.println("The standard deviation is " + stdDev());
   }

   // Prompt user for the number of students and allocate the "grades" array.
   // Then, prompt user for grade, check for valid grade, and store in "grades".
   public static void readGrades() {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of students:");
      int noStudents = in.nextInt();

	 grades = new int[noStudents];
		for (int i=0; i < noStudents; i++) {
      		System.out.print("Enter the grade for student " + (i+1) + ":");
      		int grade = in.nextInt();
      		while (!(grade >= 0 && grade <=100)) {
		  		System.out.println("Invalid grade, try again...");
		  		System.out.print("Enter the grade for student " + (i+1) + ":");
		  		grade = in.nextInt();
	  			}
	  		grades[i] = grade;
  			}
  	}

   // Return the average value of int[] grades
   public static double average() {
	   int sum = 0;
	   for (int value : grades) {
		sum += value;
   		}
   		return (double)sum/grades.length;
	   }

   // Return the maximum value of int[] grades
   public static int max() {
	   int mx = grades[0];
	   for (int value : grades) {
		if (mx < value) {mx = value;};
   		}
   		return mx;
   		}

   // Return the minimum value of int[] grades
   public static int min() {
	   int mn = grades[0];
	   	   for (int value : grades) {
	   		if (mn > value) {mn = value;};
	      		}
   		return mn;
	   }

   // Return the standard deviation of the int[] grades
   public static double stdDev() {
	   	   int sumsquare = 0;
	   	   for (int value : grades) {
	   		sumsquare += value*value;
	      		}
   		return Math.sqrt((double)sumsquare/grades.length - average()*average());

	   }
}

