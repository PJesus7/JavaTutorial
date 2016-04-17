import java.awt.*;       // Using AWT containers and components
import java.awt.event.*; // Using AWT events and listener interfaces

// A GUI program inherits the top-level Container Frame
public class AWTFactorialTextField extends Frame implements ActionListener {
   private Label lblInput;     // declare input Label
   private Label lblOutput;    // declare output Label
   private TextField tfInput;  // declare input TextField
   private TextField tfOutput; // declare output display TextField
   private int numberIn;  // the number entered

   // Constructor to setup the UI
   public AWTFactorialTextField() {
      setLayout(new FlowLayout()); // "this" Frame sets to FlowLayout

      lblInput = new Label("Enter a positive integer"); // allocate
      add(lblInput);  // "this" Frame adds the Label

      tfInput = new TextField(10);  // allocate
      add(tfInput);   // "this" Frame adds the TextField

      tfInput.addActionListener(this);
         // tfInput is a source that fires ActionEvent when entered.
         // The source add "this" object as a listener, which provides
         //  an ActionEvent handler called actionPerformed().
         // Hitting enter key on tfInput invokes actionPerformed().

      lblOutput = new Label("Factorial is");  // allocate
      add(lblOutput);  // "this" Frame adds Label

      tfOutput = new TextField(10); // allocate
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);   // "this" Frame adds TextField

      setTitle("AWT Accumulator"); // "this" Frame sets title
      setSize(300, 120);    // "this" Frame sets initial size
      setVisible(true);     // "this" Frame shows
   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTFactorialTextField();
   }

   // ActionEvent handler - Called back when enter key was hit on TextField.
   @Override
   public void actionPerformed(ActionEvent evt) {
      numberIn = Integer.parseInt(tfInput.getText());
               // get the String entered, convert to int
      int factorial = 1; int i = 1;
      	while (i <= numberIn) {factorial *= i; i++;};
      tfInput.setText("");  // clear input TextField
      tfOutput.setText("" + factorial); // display sum on the output TextField
   }
}