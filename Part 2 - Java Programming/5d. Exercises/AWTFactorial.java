import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

public class AWTFactorial extends Frame implements ActionListener {
   private Label lblCount, lblFactorial;
   private TextField tfCount, tfFactorial;
   private Button btnCount;
   private int count = 1;
   private BigInteger factorial = new BigInteger("1");

   // Constructor to setup UI components
   public AWTFactorial () {
      setLayout(new FlowLayout());

      lblCount = new Label("n");
      add(lblCount);

      tfCount = new TextField(count + "", 10);
      tfCount.setEditable(false);
      add(tfCount);

      lblFactorial = new Label("factorial (n)");
      add(lblFactorial);

      tfFactorial = new TextField(factorial + "", 20);
      tfFactorial.setEditable(false);
      add(tfFactorial);

      btnCount = new Button("Next");
      add(btnCount);
      btnCount.addActionListener(this);

      setSize(500, 100);
      setTitle("AWT Factorial");
      setVisible(true);
   }

   // ActionEvent handler - Called back when the button has been clicked.
   @Override
   public void actionPerformed(ActionEvent evt) {
      count++;
      tfCount.setText(count + "");

      factorial = factorial.multiply(new BigInteger(count + ""));
      tfFactorial.setText(factorial + "");
   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTFactorial();
   }
}