import java.util.Scanner;
public class CircleComputation {
   public static void main(String[] args) {
      double radius, area, perimeter;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the radius: ");
      radius = in.nextDouble();

      area = radius*radius*Math.PI;
      perimeter = 2*radius*Math.PI;

      // Formatted output via printf()
      System.out.printf("The area is %f%n", area);
      System.out.println("The perimeter is " + perimeter);
   }
}