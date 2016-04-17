import java.util.Scanner;

public class Sin{

   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
    System.out.print("x:");
      double x = in.nextDouble();
      System.out.print("Enter number of terms:");
      int num = in.nextInt();

      System.out.print(sin(x,num));

      }

 public static double sin(double x, int numTerms){
	double res = 0;
	for (int i=1; i<=2*numTerms; i = i+2) {
		double aux = 1;
		for (int j=i; j>=1; j--) {
			aux *= x/j;}
		res += (2-(i%4))*aux;
	}
	return res;
 }

 }