import java.util.Scanner;
public class Hex2Dec {
   public static void main(String[] args) {
      String hexStr;   // Input hexadecimal String
      int hexStrLen;   // Length of hexStr
      int dec = 0;     // Decimal equivalence

      // Read input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string: ");
      hexStr = in.next();
      hexStrLen = hexStr.length();

      // Process the string from the right
      for (int exp = 0; exp < hexStrLen; exp++) {
         char hexChar = hexStr.charAt(hexStrLen - 1 - exp);
         int factor = (int)Math.pow(16, exp);
         if (hexChar >= '0' && hexChar <= '9') {
            dec += (hexChar - '0') * factor;
         } else if (hexChar >= 'a' && hexChar <= 'f') {
            dec += (hexChar - 'a' + 10) * factor;
         } else if (hexChar >= 'A' && hexChar <= 'F') {
            dec += (hexChar - 'A' + 10) * factor;
         } else {
            System.out.println("Error: Invalid hex string \"" + hexStr + "\"");
            System.exit(1);
         }
      }
      System.out.println("The equivalent decimal for \"" + hexStr + "\" is " + dec);
   }
}