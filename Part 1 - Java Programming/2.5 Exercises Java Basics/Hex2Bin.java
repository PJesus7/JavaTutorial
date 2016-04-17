import java.util.Scanner;
public class Hex2Bin {
   public static void main(String[] args) {
      String hexStr;   // Input hexadecimal String
      int hexStrLen;   // Length of hexStr
      String bin = "";     // Binary equivalence
      String[] hexBits = {"0000", "0001", "0010", "0011",
	                      "0100", "0101", "0110", "0111",
	                      "1000", "1001", "1010", "1011",
                    	  "1100", "1101", "1110", "1111"};

      // Read input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string: ");
      hexStr = in.next();
      hexStrLen = hexStr.length();

      // Process the string from the left
      for (int pos = 0; pos < hexStrLen; pos++) {
         char hexChar = hexStr.charAt(pos);
         if (hexChar >= '0' && hexChar <= '9') {
            bin = bin + hexBits[hexChar - '0'];
         } else if (hexChar >= 'a' && hexChar <= 'f') {
            bin = bin + hexBits[hexChar - 'a' + 10];
         } else if (hexChar >= 'A' && hexChar <= 'F') {
            bin = bin + hexBits[hexChar - 'a' + 10];
         } else {
            System.out.println("Error: Invalid hex string \"" + hexStr + "\"");
            System.exit(1);
         }
         bin = bin + " ";
      }
      System.out.println("The equivalent binary for \"" + hexStr + "\" is " + bin);
   }
}