// The MyTriangle class definition
public class MyTriangle {
   // Private member variables
   private MyPoint v1;
   private MyPoint v2;
   private MyPoint v3;

   // Constructors
   public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3) {
      v1 = new MyPoint(x1,y1);
      v2 = new MyPoint(x2,y2);
      v3 = new MyPoint(x3,y3);
   }

   public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3) {
      this.v1 = v1;
      this.v2 = v2;
      this.v3 = v3;
   }

	//toString
   public String toString() {
      return "triangle @ " + v1 + ", " + v2 + ", " + v3;
   }

   public double getPerimeter() {
      return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
   }

   void printType() {
	  double s1 = v1.distance(v2);
	  double s2 = v2.distance(v3);
	  double s3 = v3.distance(v1);
	  if (s1 == s2 && s2 == s3) {
		  System.out.println("equilateral");
	  } else if (s1 == s2 || s1 == s3 || s2 == s3) {
		  System.out.println("isosceles"); }
		  else System.out.println("scalene");

   }

 }