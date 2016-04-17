public class VarargsTest {
   // A method which takes a variable number of arguments (varargs)
   public static void doSomething(String... strs) {
      System.out.print("Arguments are: ");
      for (String str : strs) {
         System.out.print(str + ", ");
      }
      System.out.println();
   }

   // A method which takes exactly two arguments
   public static void doSomething(String s1, String s2) {
      System.out.println("Overloaded version with 2 args: " + s1 + ", " + s2);
   }

   // Cannot overload with this method - crash with varargs version
   // public static void doSomething(String[] strs)

   // Test main() method
   // Can also use String... instead of String[]
   public static void main(String... args) {
      doSomething("Hello", "world", "again", "and", "again");
      doSomething("Hello", "world");

      String[] strs = {"apple", "orange"};
      doSomething(strs);  // invoke varargs version
   }
}