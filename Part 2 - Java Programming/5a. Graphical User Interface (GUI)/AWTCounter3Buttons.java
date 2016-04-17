import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTCounter3Buttons extends Frame {
   private TextField tfCount;
   private int count = 0;
 
   /** Constructor to setup the GUI */
   public AWTCounter3Buttons () {
      setLayout(new FlowLayout());
      add(new Label("Counter"));   // an anonymous instance of Label
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);  // read-only
      add(tfCount);                // "this" Frame adds tfCount
 
      Button btnCountUp = new Button("Count Up");
      add(btnCountUp);
      // Construct an anonymous instance of an anonymous inner class.
      // The source Button adds this instance as ActionEvent listener
      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            count++;
            tfCount.setText(count + "");
         }
      });
 
      Button btnCountDown = new Button("Count Down");
      add(btnCountDown);
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            count--;
            tfCount.setText(count + "");
         }
      });
 
      Button btnReset = new Button("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            count = 0;
            tfCount.setText("0");
         }
      });
 
      setTitle("AWT Counter");
      setSize(400, 100);
      setVisible(true);
   }
 
   /** The entry main method */
   public static void main(String[] args) {
      new AWTCounter3Buttons();  // Let the constructor do the job
   }
}