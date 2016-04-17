import java.util.Scanner;

public class TestMyComplex {
	public static void main(String[] args){
		MyComplex c1 = new MyComplex(2,-1);
		MyComplex c2 = new MyComplex(-2,0);
		MyComplex c3 = new MyComplex(0,1);

	System.out.println(c1 + " is a pure real number? " + c1.isReal() + ". Is it a pure imaginary number? " + c1.isImag());
	System.out.println(c2 + " is a pure real number? " + c2.isReal() + ". Is it a pure imaginary number? " + c2.isImag());
	System.out.println(c3 + " is a pure real number? " + c3.isReal() + ". Is it a pure imaginary number? " + c3.isImag());

	System.out.println(c1.magnitude());
	System.out.println(c2.argumentInRadians());
	System.out.println(c3.argumentInDegrees());

	System.out.println(c1.conjugate());
	System.out.println((c2.add(c3)));
	System.out.println((c2.subtract(c3)));

	System.out.println("Before multiplying by c1, c2 is " + c2);
	c2.multiplyWith(c1);
	System.out.println("After multiplying by c1, c2 is " + c2); //changes c2

	System.out.println(c2);
	c1.divideBy(c2);
	System.out.println(c1); //rounding errors
	System.out.println();
	//MyComplexApp

	Scanner in = new Scanner(System.in);
	System.out.print("Enter complex number 1 (real part (space) imaginary part):");
	      double real1 = in.nextDouble();
	      double imag1 = in.nextDouble();
	System.out.print("Enter complex number 2 (real part (space) imaginary part):");
	      double real2 = in.nextDouble();
	      double imag2 = in.nextDouble();
	System.out.println();

	MyComplex c5 = new MyComplex(real1,imag1);
	MyComplex c6 = new MyComplex(real2,imag2);

	System.out.println("Number 1 is: " + c5);
	System.out.println(c5 + " is a pure real number? " + c5.isReal());
	System.out.println(c5 + " is a pure imaginary number? " + c5.isImag());
	System.out.println();

	System.out.println("Number 2 is: " + c6);
	System.out.println(c6 + " is a pure real number? " + c6.isReal());
	System.out.println(c6 + " is a pure imaginary number? " + c6.isImag());
	System.out.println();

	System.out.println("Is " + c5 + " equal to " + c6 + "? " + c5.equals(c6));
	System.out.println(c5 + " + " + c6 + " = " + c5.add(c6));
	System.out.println(c5 + " - " + c6 + " = " + c5.subtract(c6));
	}
}