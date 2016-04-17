import javax.swing.*;   // Using Swing components
import java.awt.*;
import java.awt.event.*;
import java.lang.StringBuffer;

// Swing application extends from javax.swing.JFrame
public class SwingCalculator extends JFrame {

   private JTextField tfDisplay;
   private int result = 0;          // the result so far
   private StringBuffer numberInStr = new StringBuffer(); // the number entered as String
   private char previousOpr = ' ';  // the previous operator
   private char currentOpr = ' ';   // the current operator

   // Constructor to setup the UI
	public SwingCalculator() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		tfDisplay = new JTextField(20);
		tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfDisplay, BorderLayout.NORTH);

		JPanel btnPanel = new JPanel(new GridLayout(4,4,5,5));
		JButton btn7 = new JButton("7");
		btnPanel.add(btn7);
		btn7.addActionListener(new NumberBtnListener());
		JButton btn8 = new JButton("8");
		btnPanel.add(btn8);
		btn8.addActionListener(new NumberBtnListener());
		JButton btn9 = new JButton("9");
		btnPanel.add(btn9);
		btn9.addActionListener(new NumberBtnListener());
		JButton btnp = new JButton("+");
		btnPanel.add(btnp);
		btnp.addActionListener(new OprBtnListener());
		JButton btn4 = new JButton("4");
		btnPanel.add(btn4);
		btn4.addActionListener(new NumberBtnListener());
		JButton btn5 = new JButton("5");
		btnPanel.add(btn5);
		btn5.addActionListener(new NumberBtnListener());
		JButton btn6 = new JButton("6");
		btnPanel.add(btn6);
		btn6.addActionListener(new NumberBtnListener());
		JButton btnm = new JButton("-");
		btnPanel.add(btnm);
		btnm.addActionListener(new OprBtnListener());
		JButton btn1 = new JButton("1");
		btnPanel.add(btn1);
		btn1.addActionListener(new NumberBtnListener());
		JButton btn2 = new JButton("2");
		btnPanel.add(btn2);
		btn2.addActionListener(new NumberBtnListener());
		JButton btn3 = new JButton("3");
		btnPanel.add(btn3);
		btn3.addActionListener(new NumberBtnListener());
		JButton btnt = new JButton("*");
		btnPanel.add(btnt);
		btnt.addActionListener(new OprBtnListener());
		JButton btnc = new JButton("C");
		btnPanel.add(btnc);
		btnc.addActionListener(new ActionListener() {//anonymous inner class
         @Override
         public void actionPerformed(ActionEvent evt) {
			tfDisplay.setText("");
			result = 0;
			numberInStr.setLength(0); //IMPORTANT: reset string number
			previousOpr = ' '; //reset the operations
			currentOpr = ' ';}
     		});
		JButton btn0 = new JButton("0");
		btnPanel.add(btn0);
		btn0.addActionListener(new NumberBtnListener());
		JButton btne = new JButton("=");
		btnPanel.add(btne);
		btne.addActionListener(new OprBtnListener());
		JButton btnd = new JButton("/");
		btnPanel.add(btnd);
		btnd.addActionListener(new OprBtnListener());

		cp.add(btnPanel, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
      setTitle("Swing Calculator");
      setSize(300, 200);
      setVisible(true);
   }

   // Number buttons listener (inner class)
   class NumberBtnListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         numberInStr.append(evt.getActionCommand()); //the number is being built as a string
         tfDisplay.setText(numberInStr.toString());
      }
   }

   // Operator buttons listener (inner class)
	class OprBtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			previousOpr = currentOpr;  // save
			currentOpr = evt.getActionCommand().charAt(0);
			//we only care about the number previously pressed, since we input number + operation + number
			if (previousOpr == '='){ //if we input equal then we do not input a number after, but another operation
				tfDisplay.setText(result + "");
				numberInStr.setLength(0);
			} else {
			int num = Integer.parseInt(numberInStr.toString()); //convert string number into int
				if (previousOpr == ' ') { //first input of the calculator
					result = num;

				} else if (previousOpr == '+'){
					result = result + num;

				} else if (previousOpr == '-'){
					result = result - num;

				} else if (previousOpr == '*'){
					result = result * num;

				} else if (previousOpr == '/'){
					result = result / num;
				}
				tfDisplay.setText(result + "");
				numberInStr.setLength(0);
				}
		}
	}

   // The entry main() method
   public static void main(String[] args) {
      // For thread safety, use the event-dispatching thread to construct UI
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingCalculator(); // Let the constructor does the job
         }
      });
   }
}