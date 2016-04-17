// Technique 2: Use try-catch to handle exception
import java.util.Scanner;               // Needed for using Scanner
import java.io.File;                    // Needed for file operation
import java.io.FileNotFoundException;   // Needed for file operation
public class TextFileScannerWithCatch {
   public static void main(String[] args) {
      int num1;
      double num2;
      String name;
      try {                                // try these statements
         Scanner in = new Scanner(new File("in.txt"));
         num1 = in.nextInt();      // Read int
         num2 = in.nextDouble();   // Read double
         name = in.next();         // Read String
         System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1+num2);
      } catch (FileNotFoundException ex) {  // catch and handle the exception here
         ex.printStackTrace();              // print the stack trace
      }
   }
}