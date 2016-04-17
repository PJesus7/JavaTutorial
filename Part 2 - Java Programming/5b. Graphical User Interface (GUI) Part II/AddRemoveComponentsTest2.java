import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Add or remove components from a container */
@SuppressWarnings("serial")
public class AddRemoveComponentsTest2 extends JFrame {
	private int numButtons = 2; // number of squares
	JPanel[] squares = new JPanel[2];
	Container cp;
	JPanel container = new JPanel();

   /** Constructor to setup the UI components */
	public AddRemoveComponentsTest2() {
		JPanel buttonpanel = new JPanel();

	    ButtonsListener listener = new ButtonsListener();

		JButton button1 = new JButton("Add");
			buttonpanel.add(button1);
			button1.addActionListener(listener);

		JButton button2 = new JButton("Remove");
			buttonpanel.add(button2);
			button2.addActionListener(listener);

	cp = getContentPane();
	cp.setLayout(new BorderLayout());

	cp.add(buttonpanel);

	container.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
	container.setBorder(BorderFactory.createLineBorder(Color.BLUE, 15));

			squares[0] = new JPanel();
			squares[0].setBounds(30, 30, 5, 5);
			squares[0].setBackground(Color.RED);
			container.add(squares[0]);

			squares[1] = new JPanel();
			squares[1].setBounds(30, 30, 5, 5);
			squares[1].setBackground(Color.RED);
			container.add(squares[1]);

		container.setVisible(true);

	cp.add(buttonpanel, BorderLayout.NORTH);
	cp.add(container, BorderLayout.CENTER);


      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Add/Remove Components Test");
      setSize(400, 150);

      setLocationRelativeTo(null);
      	   setVisible(true);
   }


   /** Inner class used as the ActionListener for the Buttons */
   private class ButtonsListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         // adjust the number of buttons
         if (e.getActionCommand().equals("Add")) {
			numButtons++;
			container.add(squares[0]);
         } else {
            if (numButtons >= 2) {
				container.remove(squares[0]);
               numButtons--;
            }
         }
         // Call helper method to create numButtons buttons
         System.out.println(numButtons);
      }
   }

   /** The entry main() method */
   public static void main(String[] args) {
      // Run GUI codes in the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new AddRemoveComponentsTest2();  // Let the constructor do the job
         }
      });
   }
}