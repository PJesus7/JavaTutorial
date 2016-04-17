import java.awt.*;
import javax.swing.*;
 
public class TestSize {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Display Area");
      Container cp = frame.getContentPane();
      cp.setLayout(new FlowLayout());
      JButton btnHello = new JButton("Hello");
      btnHello.setPreferredSize(new Dimension(100, 80));
      cp.add(btnHello);
 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 150);  // or pack() the components
      frame.setLocationRelativeTo(null);  // center the application window
      frame.setVisible(true);             // show it
 
      System.out.println(btnHello.getSize());
      System.out.println(btnHello.getLocation());
      System.out.println(btnHello.getLocationOnScreen());
 
      System.out.println(cp.getSize());
      System.out.println(cp.getLocation());
      System.out.println(cp.getLocationOnScreen());
 
      System.out.println(frame.getSize());
      System.out.println(frame.getLocation());
      System.out.println(frame.getLocationOnScreen());
   }
}