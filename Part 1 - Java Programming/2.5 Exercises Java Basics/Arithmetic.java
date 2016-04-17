public class Arithmetic {
   public static void main (String[] args) {
      int operand1, operand2;
      char theOperator;
      operand1 = Integer.parseInt(args[0]);  // Convert String to int
      operand2 = Integer.parseInt(args[1]);
      theOperator = args[2].charAt(0);       // Consider only 1st character
      System.out.print(args[0] + args[2] + args[1] + "=");
      switch(theOperator) {
         case ('+'):
            System.out.println(operand1 + operand2); break;
         case ('-'):
            System.out.println(operand1 - operand2); break;
         case ('*'): //for this case the input has to be "*"
            System.out.println(operand1 * operand2); break;
         case ('/'):
            System.out.println(operand1 / operand2); break;
         default:
            System.out.printf("%nError: Invalid operator!");
      }
   }
}