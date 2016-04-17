// A test driver program for MyTime
public class TestMyTime {
   public static void main(String[] args) {
      MyTime t1 = new MyTime(23, 59, 58);
      System.out.println(t1);
      System.out.println(t1.nextSecond());
      System.out.println(t1.nextSecond().nextSecond().nextSecond());
 
      // MyTime t2 = new MyTime(12, 69, 69); // abrupt termination
                                             // NOT continue to next statement
 
      // Handling exception gracefully
      try {
         MyTime t3 = new MyTime(12, 69, 69);
             // skip remaining statements in try, goto catch
         System.out.println(t1);
      } catch (IllegalArgumentException ex) {
         ex.printStackTrace();
      }  // after try or catch, continue next statement
 
      System.out.println("Continue after exception!");
   }
}