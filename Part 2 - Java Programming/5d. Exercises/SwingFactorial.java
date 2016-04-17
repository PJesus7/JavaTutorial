import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // Using Swing components and containers
import java.math.BigInteger;

// A Swing application extends javax.swing.JFrame
public class SwingFactorial extends JFrame {
   private JTextField tfCount, tfFactorial;
         // Use Swing's JTextField instead of AWT's TextField
   private int count = 1;
   private BigInteger factorial = new BigInteger("1");

   public SwingFactorial () {
      // Get the content pane of top-level container Jframe
      // Components are added onto content pane
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());

      cp.add(new JLabel("n"));
      tfCount = new JTextField(count + "", 10);
      tfCount.setEditable(false);
      tfCount.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfCount);

      cp.add(new JLabel("factorial (n)"));
      tfFactorial = new JTextField(factorial + "", 15);
      tfFactorial.setEditable(false);
      tfFactorial.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfFactorial);

      JButton btnCount = new JButton("Count");
      cp.add(btnCount);
      btnCount.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) {
            count++;
            tfCount.setText(count + "");

      		factorial = factorial.multiply(new BigInteger(count + ""));
      		tfFactorial.setText(factorial + "");
         }
      });

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // Exit program if Jframe's close-window button clicked
      setSize(500, 100);
      setTitle("Swing Counter");
      setVisible(true);    // show it
   }

   public static void main(String[] args) {
      // Recommended to run the GUI construction in
      //  Event Dispatching thread for thread-safet operations
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingFactorial(); // Let the constructor does the job
         }
      });
   }
}