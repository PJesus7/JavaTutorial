public class TestMyTriangle {
   public static void main(String[] args) {
      MyTriangle t1 = new MyTriangle(2,0,0,2,1,1);
      MyTriangle t2 = new MyTriangle(1,0,0,2,-3,1);

      System.out.print(t1 + " is ");t1.printType();
      System.out.println("t1's perimeter is " + t1.getPerimeter());

      System.out.print(t2 + " is ");t2.printType();
      System.out.println("t2's perimeter is " + t2.getPerimeter());


   }
}