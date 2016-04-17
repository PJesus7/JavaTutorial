import java.util.Scanner;    // Needed to use the Scanner
public class ScannerTest {
   public static void main(String[] args) {
      int num1;
      double num2;
      String str;
      // Construct a Scanner named "in" for scanning System.in (keyboard)
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a string (with space): ");
	  	  	       // Use nextLine() to read entire line including white spaces,
	  	  	       //   but excluding the terminating newline.
      String line  = in.nextLine();

      System.out.print("Enter an integer: ");
      num1 = in.nextInt();         // Use nextInt() to read int
      System.out.print("Enter a floating point: ");
      num2 = in.nextDouble();      // Use nextDouble() to read double
      System.out.print("Enter a string: ");
      str  = in.next();            // Use next() to read a String token, up to white space



      // Formatted output via printf()
      System.out.printf("%s, Sum of %d & %.2f is %.2f. %s%n", str, num1, num2, num1+num2, line);
   }
}