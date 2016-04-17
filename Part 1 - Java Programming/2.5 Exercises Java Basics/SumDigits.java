public class SumDigits {
   public static void main (String[] args) {
      String number;
      int sum=0;
      number = args[0];
      System.out.print("The sum of digits is: ");

      for (int i=0; i<number.length(); i++){
		  System.out.print(number.charAt(i));
		  if (i<number.length()-1) {
			  System.out.print(" + ");
			  } else {
				System.out.print(" = ");
			  }
		  sum += Integer.parseInt(number.substring(i, i+1));
	  }
		System.out.println(sum);
   }
}