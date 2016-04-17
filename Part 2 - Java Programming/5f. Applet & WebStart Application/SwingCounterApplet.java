import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
/** A Swing Counter Applet */
@SuppressWarnings("serial")
public class SwingCounterApplet extends JApplet {
   private JTextField tfCount; // for displaying the counter value
   private int count = 0;      // counter's value
 
   /** init() runs when the applet is loaded */
   @Override
   public void init () {
      try {
         // Run GUI codes in the Event-Dispatcher thread for thread safety
         // Use invokeAndWait() so that init() does not exit before GUI constructed
         SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
               createGUI();
            }
         });
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
 
   /** Setup the GUI components */
   private void createGUI() {
      Container cp = getContentPane();  // "this" JApplet gets content-pane
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      cp.setBackground(new Color(204, 238, 241));
 
      cp.add(new JLabel("Counter: "));
      tfCount = new JTextField("0", 10);
      tfCount.setEditable(false);
      cp.add(tfCount);
      JButton btnCount = new JButton("Count");
      cp.add(btnCount);
 
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Increase the count and show it in the TextField
            ++count;
            tfCount.setText(count + "");
         }
      });
   }
}