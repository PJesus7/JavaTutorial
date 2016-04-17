/*
 * Find the sum and average from a lowerbound to an upperbound
 */
public class TypeCastingTest {   // Save as "TypeCastingTest.java"
   public static void main(String[] args) {
      int lowerbound = 1;
      int upperbound = 1000;
      int sum = 0;      // sum is "int"
      double average;   // average is "double"
      // Compute the sum (in "int")
      for (int number = lowerbound; number <= upperbound; number++) {
         sum = sum + number;
      }
      System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
      // Compute the average (in "double")
      average = sum/1000;
      System.out.println("Average 1 is " + average);
      average = (double)sum/1000;
      System.out.println("Average 2 is " + average);
      average = sum/1000.0;
      System.out.println("Average 3 is " + average);
      average = (double)(sum/1000);
      System.out.println("Average 4 is " + average);
   }
}