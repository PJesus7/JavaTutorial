public class ComputePi {
   public static void main (String[] args) {
      double sum = 0;
      int maxDenom = 100000000;

      for (int denom = 1; denom <= maxDenom; denom = denom + 2) {
		  if (denom % 4 == 1) {
		  		sum += 1.0/denom;
		  } else if (denom % 4 == 3) {
				sum -= 1.0/denom;
      }
	}
      sum = 4*sum;
      System.out.println("The approximated value of Pi is " + sum);
      System.out.println("Pi is " + Math.PI);
      System.out.println("Closeness is " + sum/Math.PI);
   }
}