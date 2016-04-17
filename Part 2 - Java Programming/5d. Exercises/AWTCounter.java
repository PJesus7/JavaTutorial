import java.awt.*;         // Using AWT containers and components
import java.awt.event.*;   // Using AWT events and listener interfaces

// An AWT GUI program inherits the top-level container Frame
public class AWTCounter extends Frame implements ActionListener, WindowListener {
   private Label lblCount;     // declare component Label
   private TextField tfCount;  // declare component TextField
   private Button btnCount;    // declare component Button
   private int count = 0;      // counter's value

   // Constructor to setup UI components
   public AWTCounter () {
      setLayout(new FlowLayout());
         // "this" Frame sets layout to FlowLayout, which arranges
         //  Components from left-to-right, then top-to-bottom.

      lblCount = new Label("Counter"); // allocate Label instance
      add(lblCount);                   // "this" Frame adds Label

      tfCount = new TextField(count + "", 10); // allocate
      tfCount.setEditable(false);       // read-only
      add(tfCount);                     // "this" Frame adds tfCount

      btnCount = new Button("Count");   // allocate Button instance
      add(btnCount);                    // "this" Frame adds btnCount
      btnCount.addActionListener(this);
         // btnCount is a source that fires ActionEvent when clicked.
         // The source add "this" object as a listener, which provides
         //  the ActionEvent handler called actionPerformed().
         // Clicking btnCount invokes actionPerformed().

      setSize(250, 100);       // "this" Frame sets initial size
      setTitle("AWT Counter"); // "this" Frame sets title
      setVisible(true);        // show "this" Frame

      addWindowListener(this);
        // "this" Frame fires WindowEvent.
        // "this" class is also the WindowEvent listener
   }

   // ActionEvent handler - Called back when the button has been clicked.
   @Override
   public void actionPerformed(ActionEvent evt) {
      count++;                     // incrase the counter value
      tfCount.setText(count + ""); // display on the TextField
                                   // setText() takes a String
   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTCounter();
   }

   // WindowEvent handlers
   @Override
   public void windowClosing(WindowEvent e) {
      System.exit(0);  // terminate the program
   }

   @Override
   public void windowOpened(WindowEvent e) { }

   @Override
   public void windowClosed(WindowEvent e) { }

   @Override
   public void windowIconified(WindowEvent e) { }

   @Override
   public void windowDeiconified(WindowEvent e) { }

   @Override
   public void windowActivated(WindowEvent e) { }

   @Override
   public void windowDeactivated(WindowEvent e) { }
}