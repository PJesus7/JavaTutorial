import java.util.Scanner;
public class GradesAverage {
   public static void main(String[] args) {
      	int noStudents; //number of students
		int grade;
		double average;

      // Read input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of students:");
      noStudents = in.nextInt();

	int[] grades = new int[noStudents];
		for (int i=0; i < noStudents; i++) {
      		System.out.print("Enter the grade for student " + (i+1) + ":");
      		grade = in.nextInt();
      		while (!(grade >= 0 && grade <=100)) {
		  		System.out.println("Invalid grade, try again...");
		  		System.out.print("Enter the grade for student " + (i+1) + ":");
		  		grade = in.nextInt();
	  			}
	  		grades[i] = grade;
  			}

  		// average
  		int sum = 0;
  		for (int value : grades) {
		sum += value;}
		average = (double)sum/noStudents;
		System.out.println("The average is " + average);
   }
}