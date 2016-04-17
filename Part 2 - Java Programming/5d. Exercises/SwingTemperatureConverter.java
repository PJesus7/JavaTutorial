import javax.swing.*;   // Swing components
import java.awt.*;
import java.awt.event.*;

// Swing application extends from javax.swing.JFrame
public class SwingTemperatureConverter extends JFrame {

   private JTextField tfCelsius, tfFahrenheit;
   private float celsius, fahrenheit;

   public SwingTemperatureConverter() {       // Constructor
      // Swing components must be added to the ContentPane.
      Container cp = getContentPane();
      // Set this Container to grid layout of 4 rows and 2 columns
      cp.setLayout(new GridLayout(2, 2, 10, 3));

      // Components are added from left-to-right, top-to-bottom
      cp.add(new JLabel("Celsius:"));     // at (1, 1)
      tfCelsius = new JTextField(10);
      tfCelsius.setHorizontalAlignment(JTextField.LEFT);
      cp.add(tfCelsius);                       // at (1, 2)
      tfCelsius.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
				celsius = Float.parseFloat(tfCelsius.getText());
				fahrenheit = celsius*(float)(9.0/5.0) + (float)32;

				tfFahrenheit.setText(String.format("%.1f", fahrenheit));
         }
      });

      cp.add(new JLabel("Fahrenheit:"));     // at (2, 1)
      tfFahrenheit = new JTextField(10);
      tfFahrenheit.setHorizontalAlignment(JTextField.LEFT);
      cp.add(tfFahrenheit);                       // at (2, 2)
      tfFahrenheit.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
				fahrenheit = Float.parseFloat(tfFahrenheit.getText());
				celsius = (fahrenheit - 32) * (float)(5.0/9.0);

				tfCelsius.setText(String.format("%.1f", celsius));
         }
      });

      setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
      setTitle("Swing Adder");
      setSize(300, 100);
      setVisible(true);
   }

   // The entry main() method
   public static void main(String[] args) {
      // For thread safety, use the event-dispatching thread to construct UI
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingTemperatureConverter(); // Let the constructor does the job
         }
      });
   }
}