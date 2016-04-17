public class Product1ToN {
   public static void main (String[] args) {
      int product = 1;
      int lowerbound = 1;
      int upperbound = 10;

		int num=lowerbound;
      while (num <=upperbound){
		  product *= num; num++;}
		System.out.println("The factorial of 10 is " + product);
		product = product * 11;
		System.out.println("The factorial of 11 is " + product);
		product = product * 12;
		System.out.println("The factorial of 12 is " + product);
		product = product * 13;
		System.out.println("The factorial of 13 is " + product);
		product = product * 14;
		System.out.println("The factorial of 14 is " + product);
		product = product * 15;
		System.out.println("The factorial of 15 is " + product);
   }
}