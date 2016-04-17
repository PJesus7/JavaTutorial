import java.util.Scanner;
public class TestPalindromicWord {
   public static void main(String[] args) {
      String inStr;
      int inStrLen;
      boolean ispalindrome = true;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next();
      inStr = inStr.toLowerCase();
      inStrLen = inStr.length();

		int i=0;
   		while (i<inStrLen/2+1 && ispalindrome) {
   		if (inStr.charAt(i) != inStr.charAt(inStrLen-i-1)) {
			ispalindrome = false;};
			i++;
		}
      if (ispalindrome) {System.out.println("\"\t" + inStr + "\" is \ta palindrome.");
	  } else {System.out.println("\"" + inStr + "\" is not a palindrome.");
  	}
   }
}