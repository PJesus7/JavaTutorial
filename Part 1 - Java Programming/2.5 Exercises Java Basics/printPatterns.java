import java.util.Scanner;

public class printPatterns {

   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
	  System.out.print("Enter size of the patterns:");
      int n = in.nextInt();

      printPatterna(n);
      System.out.println();
      printPatternb(n);
      System.out.println();
      printPatternc(n);
      System.out.println();
      printPatternd(n);
      System.out.println();
      printPatterne(n);
      System.out.println();
      printPatternf(n);
      System.out.println();
      printPatterng(n);
      System.out.println();
      printPatternh(n);
      System.out.println();
      printPatterni(n);
      System.out.println();
      printPatternj(n);
      System.out.println();
      printPatternk(n);
      System.out.println();
      printPatternl(n);
      System.out.println();
      printPatternm(n);
      System.out.println();
      printPatternn(n);
      System.out.println();
      printPatterno(n);
      System.out.println();
      printPatternp(n);
      System.out.println();
      printPatternq(n);
      System.out.println();
      printPatternr(n);
      System.out.println();
      printPatterns(n);
      System.out.println();
      printPatternt(n);
      System.out.println();
      printPatternu(n);
      System.out.println();
   }
// -----------------------(a)--------------------------------
   public static void printPatterna(int size) {
	   for (int i=1; i <= size; i++) {
	   		for (int j=1; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
// -------------------------(b)-------------------------------
	   public static void printPatternb(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=size-i+1; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
	}
// -------------------------(c)-------------------------------
	   public static void printPatternc(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=i) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// --------------------------(d)------------------------------
	   public static void printPatternd(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=size-i+1) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// -------------------------(e)-------------------------------
	   public static void printPatterne(int size) {
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();

		   for (int i=2; i <= size-1; i++) {
		   		for (int j=1; j<=size; j++) {

					if (j==1 || j==size) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();
	}
// -------------------------(f)-------------------------------
	   public static void printPatternf(int size) {
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();

		   for (int i=2; i <= size-1; i++) {
		   		for (int j=1; j<=size; j++) {

					if (j==i) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();
	}
// -----------------------(g)---------------------------------
	   public static void printPatterng(int size) {
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();

		   for (int i=2; i <= size-1; i++) {
		   		for (int j=1; j<=size; j++) {

					if (j==size-i+1) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();
	}
// ------------------------(h)--------------------------------
	   public static void printPatternh(int size) {
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();

		   for (int i=2; i <= size-1; i++) {
		   		for (int j=1; j<=size; j++) {

					if (j==i || j==size-i+1) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();
	}
// ------------------------(i)--------------------------------
	   public static void printPatterni(int size) {
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();

		   for (int i=2; i <= size-1; i++) {
		   		for (int j=1; j<=size; j++) {

					if (j==1 || j==i || j==size-i+1 || j==size) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
		   	for (int j=1; j<=size; j++) {
				System.out.print("#");}
				System.out.println();
	}
// ------------------------(j)--------------------------------
	   public static void printPatternj(int size) {
		   for (int i=1; i <= (size+1)/2; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=i && j<=size-i+1) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// ------------------------(k)--------------------------------
	   public static void printPatternk(int size) {
		   for (int i=1; i <= (size+1)/2; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=(size+1)/2-i+1 && j<=size/2+i) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// ------------------------(l)--------------------------------
	   public static void printPatternl(int size) {
		   for (int i=1; i <= (size+1)/2; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=(size+1)/2-i+1 && j<=size/2+i) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
		   for (int i=2; i <= (size+1)/2; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=i && j<=size-i+1) {System.out.print("#");
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	   }
// -----------------------(m)--------------------------------
   public static void printPatternm(int size) {
	   for (int i=1; i <= size; i++) {
	   		for (int j=1; j<=i; j++) {
				System.out.print(j%10);
			}
			System.out.println();
		}
	}
// -------------------------(n)-------------------------------
	   public static void printPatternn(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=i) {System.out.print((j-i+1)%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// --------------------------(o)------------------------------
	   public static void printPatterno(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=size; j++) {
					if (j>=size-i+1) {System.out.print((size-j+1)%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// -------------------------(p)-------------------------------
	   public static void printPatternp(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=size-i+1; j++) {
					System.out.print(((size-j+1)-i+1)%10);
				}
				System.out.println();
			}
	}
// ------------------------(q)--------------------------------
	   public static void printPatternq(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=2*size - 1; j++) {
					if (j>=size-(i-1) && j<=size+(i-1)) {System.out.print((i-Math.abs(j-size))%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// ------------------------(r)--------------------------------
	   public static void printPatternr(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=2*size - 1; j++) {
					if (j>=i && j<=2*size -i) {System.out.print(((size+1-i)-Math.abs(j-size))%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// ------------------------(s)--------------------------------
	   public static void printPatterns(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=2*size - 1; j++) {
					if (j<= i) {
						System.out.print(j%10);
					} else if (j>=2*size -i) {
						System.out.print((2*size -j)%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// ------------------------(t)--------------------------------
	   public static void printPatternt(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=2*size - 1; j++) {
					if (j<= size-i+1) {
						System.out.print(j%10);
					} else if (j>=size +i-1) {
						System.out.print((2*size -j)%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
// ------------------------(u)--------------------------------
	   public static void printPatternu(int size) {
		   for (int i=1; i <= size; i++) {
		   		for (int j=1; j<=2*size - 1; j++) {
					if (j>=size-(i-1) && j<=size+(i-1)) {System.out.print((2*i-1-Math.abs(j-size))%10);
					} else {System.out.print(" ");}
				}
				System.out.println();
			}
	}
}