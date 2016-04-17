import java.util.Scanner;
public class ReverseString {
   public static void main(String[] args) {
      String inStr;        // input String
      int inStrLen;        // length of the input String
      String output = "";

      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next();   // use next() to read String
      inStrLen = inStr.length();

   		for(int i=inStrLen-1; i>=0; i--) {
		// Use inStr.charAt(index) to extract character at 'index' from inStr
   		output = output + inStr.charAt(i);
		}
      System.out.println("The reverse of string \"" + inStr + "\" is \"" + output + "\".");
   }
}