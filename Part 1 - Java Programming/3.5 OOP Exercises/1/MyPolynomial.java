import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MyPolynomial {
   private double[] coeffs;

   public MyPolynomial(double... coeffs) {  // varargs
      this.coeffs = coeffs;                 // varargs is treated as array
   }

   public MyPolynomial(String filename) {
      Scanner in = null;
      try {
         in = new Scanner(new File(filename));  // open file
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      int degree = in.nextInt();      // read the degree
      coeffs = new double[degree+1];  // allocate the array
      for (int i=0; i<coeffs.length; i++) {
         coeffs[i] = in.nextDouble();
      }
	}

	public int getDegree(){
		return coeffs.length-1;
	}

	public String toString(){
		String out = "\"" + coeffs[getDegree()] + "x^" + getDegree();
		for (int i=getDegree()-1; i>=2; i--) {
			if (coeffs[i] > 0) {
				out += " + " + coeffs[i] + "x^" + i;}
			else if (coeffs[i] < 0) {
				out += " - " + (-coeffs[i]) + "x^" + i;}
      }
		if (getDegree()>1) {
			if (coeffs[1] > 0) {
			out += " + " + coeffs[1] + "x";}
		else if (coeffs[1] < 0) {
			out += " - " + (-coeffs[1]) + "x";}
			}
		if (getDegree()>0) {
			if (coeffs[0] > 0) {
			out += " + " + coeffs[0];}
		else if (coeffs[0] < 0) {
			out += " - " + (-coeffs[0]);}
			}
			out += "\"";
      return out;
	}

	public double evaluate(double x){
		double ans = 0;
		for (int i=0; i<coeffs.length; i++) {
		ans += coeffs[i]*Math.pow(x,i);
	}
	return ans;
	}

}