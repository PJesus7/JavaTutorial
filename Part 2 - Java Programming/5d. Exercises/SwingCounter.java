import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // Using Swing components and containers
 
// A Swing application extends javax.swing.JFrame
public class SwingCounter extends JFrame {
   private JTextField tfCount;
         // Use Swing's JTextField instead of AWT's TextField
   private int count = 0;
 
   public SwingCounter () {
      // Get the content pane of top-level container Jframe
      // Components are added onto content pane
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
 
      cp.add(new JLabel("Counter"));
      tfCount = new JTextField(count + "", 10);
      tfCount.setEditable(false);
      tfCount.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfCount);
 
      JButton btnCount = new JButton("Count");
      cp.add(btnCount);
      btnCount.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) {
            count++;
            tfCount.setText(count + "");
         }
      });
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // Exit program if Jframe's close-window button clicked
      setSize(300, 100);
      setTitle("Swing Counter");
      setVisible(true);    // show it
   }
 
   public static void main(String[] args) {
      // Recommended to run the GUI construction in
      //  Event Dispatching thread for thread-safet operations
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingCounter(); // Let the constructor does the job
         }
      });
   }
}