import javax.swing.*;   // Swing components
import java.awt.*;
import java.awt.event.*;

// Swing application extends from javax.swing.JFrame
public class SwingAritmetics extends JFrame {

   private JTextField tfNumber1, tfNumber2, tfResult;
   private JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnRemainder, btnClear;
   private int number1, number2, result;

   public SwingAritmetics() {       // Constructor
      // Swing components must be added to the ContentPane.
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(6, 2, 10, 3));

      cp.add(new JLabel("First Number "));     // at (1, 1)
      tfNumber1 = new JTextField(10);
      tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfNumber1);                       // at (1, 2)

      cp.add(new JLabel("Second Number "));     // at (2, 1)
      tfNumber2 = new JTextField(10);
      tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfNumber2);                       // at (2, 2)

      cp.add(new JLabel("Result "));     // at (3, 1)
      tfResult = new JTextField(10);
      tfResult.setHorizontalAlignment(JTextField.RIGHT);
      tfResult.setEditable(false);
      cp.add(tfResult);                  // at (3, 2)

      btnAdd = new JButton("+");
      cp.add(btnAdd);                         // at (4, 1)
      btnAdd.addActionListener(new BtnListener()); //named inner class

      btnSubtract = new JButton("-");
	  cp.add(btnSubtract);                         // at (4, 2)
      btnSubtract.addActionListener(new BtnListener());

      btnMultiply = new JButton("*");
      cp.add(btnMultiply);                         // at (5, 1)
      btnMultiply.addActionListener(new BtnListener());

      btnDivide = new JButton("/");
      cp.add(btnDivide);                         // at (5, 2)
      btnDivide.addActionListener(new BtnListener());

      btnRemainder = new JButton("%");
      cp.add(btnRemainder);                         // at (6, 1)
      btnRemainder.addActionListener(new BtnListener());

      btnClear = new JButton("CLEAR");
      cp.add(btnClear);                                // at (6, 2)
      btnClear.addActionListener(new ActionListener() {//anonymous inner class
         @Override
         public void actionPerformed(ActionEvent evt) {
            tfNumber1.setText("");
            tfNumber2.setText("");
            tfResult.setText("");
         }
      });

      setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
      setTitle("Swing Adder");
      setSize(300, 300);
      setVisible(true);
   }

   // The entry main() method
   public static void main(String[] args) {
      // For thread safety, use the event-dispatching thread to construct UI
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingAritmetics(); // Let the constructor does the job
         }
      });
   }

	private class BtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String btnLabel = e.getActionCommand();
			number1 = Integer.parseInt(tfNumber1.getText());
			number2 = Integer.parseInt(tfNumber2.getText());
			// event.getActionCommand() returns the button's label
			if (btnLabel.equals("+")){
				result = number1 + number2;
				tfResult.setText(result + "");

				} else if (btnLabel.equals("-")){
				result = number1 - number2;
				tfResult.setText(result + "");

				} else if (btnLabel.equals("*")){
				result = number1 * number2;
				tfResult.setText(result + "");

				} else if (btnLabel.equals("/")){
				result = number1 / number2;
				tfResult.setText(result + "");

				} else if (btnLabel.equals("%")){
				result = number1 % number2;
				tfResult.setText(result + "");
				}
			}
	}

}