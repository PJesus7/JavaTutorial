import java.awt.*;       // Using AWT containers and components
import java.awt.event.*; // Using AWT events and listener interfaces
 
// A GUI program inherits the top-level Container Frame
public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;     // declare input Label
   private Label lblOutput;    // declare output Label
   private TextField tfInput;  // declare input TextField
   private TextField tfOutput; // declare output display TextField
   private int numberIn;  // the number entered
   private int sum = 0;   // the accumulated sum, init to 0
 
   // Constructor to setup the UI
   public AWTAccumulator() {
      setLayout(new FlowLayout()); // "this" Frame sets to FlowLayout
 
      lblInput = new Label("Enter an integer"); // allocate
      add(lblInput);  // "this" Frame adds the Label
 
      tfInput = new TextField(10);  // allocate
      add(tfInput);   // "this" Frame adds the TextField
 
      tfInput.addActionListener(this);
         // tfInput is a source that fires ActionEvent when entered.
         // The source add "this" object as a listener, which provides
         //  an ActionEvent handler called actionPerformed().
         // Hitting enter key on tfInput invokes actionPerformed().
 
      lblOutput = new Label("Accumulated sum is");  // allocate
      add(lblOutput);  // "this" Frame adds Label
 
      tfOutput = new TextField(10); // allocate
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);   // "this" Frame adds TextField
 
      setTitle("AWT Accumulator"); // "this" Frame sets title
      setSize(350, 120);    // "this" Frame sets initial size
      setVisible(true);     // "this" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back when enter key was hit on TextField.
   @Override
   public void actionPerformed(ActionEvent evt) {
      numberIn = Integer.parseInt(tfInput.getText());
               // get the String entered, convert to int
      sum += numberIn;      // accumulate numbers entered into sum
      tfInput.setText("");  // clear input TextField
      tfOutput.setText("" + sum); // display sum on the output TextField
   }
}