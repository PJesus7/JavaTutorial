import java.awt.*;
import java.util.Random;

/**
 * The bouncing ball.
 *
 * @author Hock-Chuan Chua
 * @version v0.4 (31 October 2010)
 */
public class Ball {
   float x, y;           // Ball's center x and y (package access)
   float radius;         // Ball's radius (package access)
   private Color color;  // Ball's color

   public Ball(float x, float y, float radius, Color color) {
      this.x = x;
      this.y = y;
      this.radius = radius;
      this.color = color;
   }
   /** Constructor with random color */
   public Ball(float x, float y, float radius) {
	  this.x = x;
	  this.y = y;
	  this.radius = radius;
	  Random rn = new Random(); int c1 = rn.nextInt(256);
	  rn = new Random(); int c2 = rn.nextInt(256);
	  rn = new Random(); int c3 = rn.nextInt(256);
      this.color = new Color(c1, c2, c3);
   }

   /** Draw itself using the given graphics context. */
   public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval((int)(x - radius), (int)(y - radius), (int)(2 * radius), (int)(2 * radius));
   }
}
