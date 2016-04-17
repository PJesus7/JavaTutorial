import java.awt.*;         // Using AWT containers and components
import java.awt.event.*;   // Using AWT events and listener interfaces

public class AWTCounterDown extends Frame implements ActionListener {
   private Label lblCount;     // declare component Label
   private TextField tfCount;  // declare component TextField
   private Button btnCount;    // declare component Button
   private int count = 88;      // counter's value

   // Constructor to setup UI components
   public AWTCounterDown () {
      setLayout(new FlowLayout());
         // "this" Frame sets layout to FlowLayout, which arranges
         //  Components from left-to-right, then top-to-bottom.

      lblCount = new Label("Counter"); // allocate Label instance
      add(lblCount);                   // "this" Frame adds Label

      tfCount = new TextField(count + "", 10); // allocate
      tfCount.setEditable(false);       // read-only
      add(tfCount);                     // "this" Frame adds tfCount

      btnCount = new Button("Count Down");   // allocate Button instance
      add(btnCount);                    // "this" Frame adds btnCount
      btnCount.addActionListener(this);

      setSize(300, 80);
      setTitle("AWT Counter");
      setVisible(true);
   }

   // ActionEvent handler - Called back when the button has been clicked.
   @Override
   public void actionPerformed(ActionEvent evt) {
      count--;
      tfCount.setText(count + "");
   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTCounterDown();
   }
}