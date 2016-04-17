import java.applet.Applet;
import java.awt.*;        // Using AWT containers and components
import java.awt.event.*;  // Using AWT events and listener interfaces
 
// An applet extends java.applet.Applet
public class AWTAccumulatorApplet extends Applet implements ActionListener {
   private TextField tfInput;   // input TextField
   private int number;   // number entered
   private int sum = 0;  // accumulated sum
 
   // init() runs when the applet is loaded. Setup the UI.
   public void init() {
      add(new Label("Enter an integer"));
 
      tfInput = new TextField(10);
      add(tfInput);
      tfInput.addActionListener(this);
         // Hitting enter key on tfInput invokes actionPerformed()
   }
 
   // ActionEvent handler - Called back when enter key was hit on TextField.
   public void actionPerformed( ActionEvent evt) {
      number = Integer.parseInt(evt.getActionCommand());
         // getActionCommand() returns the String entered.
      sum += number;
      tfInput.setText("");  // Clear input TextField
      showStatus("The accumulated sum is: " + sum);
         // show the sum on the status bar of the browser's window
   }
}