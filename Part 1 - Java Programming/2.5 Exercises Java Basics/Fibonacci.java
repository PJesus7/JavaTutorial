public class Fibonacci {
   public static void main (String args[]) {
      int n = 3;          // the index n for F(n), starting from n=3
      int fn;             // F(n) to be computed
      int fnMinus1 = 1;   // F(n-1), init to F(2)
      int fnMinus2 = 1;   // F(n-2), init to F(1)
      int nMax = 30;      // maximum n, inclusive
      int sum = fnMinus1 + fnMinus2;
      double average;

      System.out.println("The first " + nMax + " Fibonacci numbers are:");
      System.out.print(fnMinus2 + " " + fnMinus1 + " ");

      while (n <= nMax) {
         // Compute F(n), print it and add to sum
         fn = fnMinus1 + fnMinus2;
         System.out.print(fn + " ");
         sum += fn;
         // Adjust the index n and shift the numbers
         fnMinus2 = fnMinus1; fnMinus1 = fn; n++;
      }

      // Compute and display the average (=sum/nMax)
      System.out.println("");
      average = (double)sum/nMax;
      System.out.println("The average is " + average);
   }
}