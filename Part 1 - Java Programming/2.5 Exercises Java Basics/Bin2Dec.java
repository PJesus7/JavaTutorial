import java.util.Scanner;

public class Bin2Dec {
   public static void main(String[] args) {
      String binStr;    // The input binary string
      int binStrLen;    // Length of binStr
      int dec = 0;      // Equivalent decimal number
  
      // Read input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a binary string: ");
      binStr = in.next();
      binStrLen = binStr.length();
   
      // Process the String from112 the right (i.e. LSB)
      for (int exp = 0; exp < binStrLen ; exp++) {
         char binChar = binStr.charAt(binStrLen - 1 - exp);
         if (binChar == '1') {
            dec += (int)Math.pow(2, exp);
         } else if (binChar != '0') {
            System.out.println("Error: Invalid binary string \"" + binStr + "\"");
            System.exit(1);   // quit
         }
      }
      System.out.println("The equivalent decimal is " + dec);
   }
}