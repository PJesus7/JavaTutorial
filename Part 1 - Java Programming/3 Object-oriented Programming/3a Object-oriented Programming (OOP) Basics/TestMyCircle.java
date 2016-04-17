// A test driver for MyCircle class
public class TestMyCircle {
   public static void main(String[] args) {
      MyCircle c1 = new MyCircle();
      System.out.println(c1);
      c1.setCenterXY(0, 3);
      System.out.println(c1);
 
      MyPoint p1 = new MyPoint(4, 0);
      MyCircle c2 = new MyCircle(p1, 9);
      System.out.println(c2);
 
      // Test distance() methods
      System.out.println(c1.distance(c2));
   }
}