/*
 * Print the area and perimeter of a circle, given its radius.
 */
public class CircleComputation {  // Saved as "CircleComputation.java"
   public static void main(String[] args) {
      // Declare variables
      double radius;
      double area;
      double perimeter;

      // Assign a value to radius
      radius = 1.2;

      // Compute area and perimeter
      area = radius * radius * 3.1416;
      perimeter = 2.0 * radius * 3.1416;

      // Print results
      System.out.print("The radius is ");  // Print description
      System.out.println(radius);          // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
}