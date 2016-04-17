import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTFlowLayoutDemo extends JFrame {
   public JButton btn1, btn2, btn3, btn4, btn5, btn6;

   /** Constructor to setup GUI components */
   public AWTFlowLayoutDemo () {


	JPanel panel = new JPanel();
	panel.setSize(100, 100);
	panel.setLayout(new GridLayout(0,1));

      btn1 = new JButton("Button 1");
      panel.add(btn1);
      btn2 = new JButton("This is Button 2");
      panel.add(btn2);
      btn3 = new JButton("3");
      panel.add(btn3);
      btn4 = new JButton("Another Button 4");
      panel.add(btn4);
      btn5 = new JButton("Button 5");
      panel.add(btn5);
      btn6 = new JButton("One More Button 6");
      panel.add(btn6);

	  	JScrollPane scroller = new JScrollPane(panel);
	getContentPane().add(scroller, BorderLayout.CENTER);

      setTitle("FlowLayout Demo"); // "this" Frame sets title
      setSize(280, 150);      // "this" Frame sets initial size
      setVisible(true);       // "this" Frame shows
   }

   /** The entry main() method */
   public static void main(String[] args) {
      // Run GUI codes in the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new AWTFlowLayoutDemo();  // Let the constructor do the job
         }
      });
   }
}