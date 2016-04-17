public class HarmonicSum {   // saved as "HarmonicSum.java"
   public static void main (String[] args) {
      int maxDenominator = 50000;
      double sumL2R = 0.0;    // sum from left-to-right
      double sumR2L = 0.0;    // sum from right-to-left

      // for-loop for summing from left-to-right
      for (int denominator = 1; denominator <= maxDenominator; denominator++) {
          sumL2R += 1.0/denominator;
      }
      for (int denominator = maxDenominator; denominator >= 1; denominator--) {
          sumR2L += 1.0/denominator;
      }
      System.out.println("The sum L2R is " + sumL2R);
      System.out.println("The sum R2L is " + sumR2L);
      System.out.println("The difference is " + (sumR2L-sumL2R));
   }
}