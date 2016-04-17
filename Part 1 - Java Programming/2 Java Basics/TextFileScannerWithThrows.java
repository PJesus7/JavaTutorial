// Technique 1: Declare "throws FileNotFoundException" in the enclosing main() method
import java.util.Scanner;               // Needed for using Scanner
import java.io.File;                    // Needed for file operation
import java.io.FileNotFoundException;   // Needed for file operation
public class TextFileScannerWithThrows {
   public static void main(String[] args)
          throws FileNotFoundException {  // Declare "throws" here
      int num1;
      double num2;
      String name;
      Scanner in = new Scanner(new File("in.txt"));  // Scan input from text file
      num1 = in.nextInt();      // Read int
      num2 = in.nextDouble();   // Read double
      name = in.next();         // Read String
      System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1+num2);
   }
}