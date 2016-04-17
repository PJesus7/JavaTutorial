import java.util.Scanner;

public class TestMyPolynomial {
	public static void main(String[] args){
		MyPolynomial p1 = new MyPolynomial(2,-5,3,-2,4.5);

	System.out.println(p1.getDegree());
	System.out.println(p1);
	System.out.println(p1.evaluate(2));
	System.out.println(p1.evaluate(3.2));
	}
}