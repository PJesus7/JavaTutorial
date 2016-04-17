/** Main class */
import java.applet.Applet;
import java.awt.*;
public class HelloAppletAgain extends Applet {
   public void paint (Graphics g) {
      setBackground(Color.GREEN); // set background color
      g.setColor(Color.BLUE);     // set foreground text color
      g.drawString((new HelloAppletHelper()).getMessage(), 5, 30);
   }
}