import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Bouncing Ball (Animation) via custom thread */
public class CGBouncingBall extends JFrame {
   // Define named-constants
   private static final int CANVAS_WIDTH = 640;
   private static final int CANVAS_HEIGHT = 480;
   private static final int UPDATE_INTERVAL = 10; // milliseconds

   private DrawCanvas canvas;  // the drawing canvas (extends JPanel)
   boolean next = false;
   public Ball ball = new Ball(100,100,100);

   // Attributes of moving object
   private int xSpeed = 3;  // moving speed in x and y directions
   private int ySpeed = 5;  // displacement per step in x and y

   /** Constructor to setup the GUI components */
   public CGBouncingBall() {
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
      this.setContentPane(canvas);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();
      this.setTitle("Bouncing Ball");
      this.setVisible(true);

      //when you click you get a new ball
      canvas.addMouseListener(new MouseAdapter() {//ADAPTER
	  	@Override
	  	public void mouseClicked(MouseEvent e) {  // mouse-clicked handler
	    	next = true;}
		});

      // Create a new thread to run update at regular interval
      Thread updateThread = new Thread() {
         @Override
         public void run() {
            while (true) {
               if (next) {
               	update();   // update the (x, y) position
               	repaint();  // Refresh the JFrame. Called back paintComponent()
               }
               try {
                  // Delay and give other thread a chance to run
                  Thread.sleep(UPDATE_INTERVAL);  // milliseconds
               } catch (InterruptedException ignore) {}
            }
         }
      };
      updateThread.start(); // called back run()
   }

   /** Update the (x, y) position of the moving object */
   public void update() {
      ball.x += xSpeed;
      ball.y += ySpeed;
      if (ball.x > CANVAS_WIDTH - ball.radius || ball.x - ball.radius < 0) {
         xSpeed = -xSpeed; next = false;
      }
      if (ball.y > CANVAS_HEIGHT - ball.radius || ball.y- ball.radius < 0) {
         ySpeed = -ySpeed; next = false;
      }
   }

   /** DrawCanvas (inner class) is a JPanel used for custom drawing */
   class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);  // paint parent's background
         setBackground(Color.BLACK);
         g.setColor(Color.BLUE);
         ball.draw(g);  // draw a circle
      }
   }

   /** The entry main method */
   public static void main(String[] args) {
      // Run GUI codes in Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new CGBouncingBall(); // Let the constructor do the job
         }
      });
   }
}