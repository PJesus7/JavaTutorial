import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Bouncing Ball (Animation) via Swing Timer */
@SuppressWarnings("serial")
public class CGBouncingBallSwingTimer extends JFrame {
   // Define named-constants
   private static final int CANVAS_WIDTH = 640;
   private static final int CANVAS_HEIGHT = 480;
   private static final int UPDATE_PERIOD = 10; // milliseconds
	int j = 0, maxballs = 25; boolean next = false;
   public Ball[] ball = new Ball[maxballs+1];

   private DrawCanvas canvas;  // the drawing canvas (extends JPanel)
   Timer time;

   /** Constructor to setup the GUI components */
   public CGBouncingBallSwingTimer() {

	  ball[j] = new Ball((j+1)*100,50,10);
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


      // Define an ActionListener to perform update at regular interval
      ActionListener updateTask = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            update();   // update the (x, y) position
            repaint();  // Refresh the JFrame, callback paintComponent()
			if (ball[j].y >= CANVAS_HEIGHT - ball[j].radius && next) {
				if (j==maxballs) {
					time.stop();
					System.out.println("end");
					}
				else {
					next = false;
					j += 1;
					ball[j] = new Ball((j+1)*100 % 640,50,10);
					/*try { //if we have the click then this part is useless
						Thread.sleep(1000);
					} catch(InterruptedException e) {
					}*/
				}
			}
        }
      };
      // Allocate a Timer to run updateTask's actionPerformed() after every delay msec
      time = new Timer(UPDATE_PERIOD, updateTask);
      time.start();

   }

   /** Update the (x, y) position of the moving object */
   public void update() {
	 if (ball[j].y < CANVAS_HEIGHT - ball[j].radius) ball[j].y = ball[j].y + 10;
   }

   /** DrawCanvas (inner class) is a JPanel used for custom drawing */
   private class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);  // paint parent's background
         setBackground(Color.BLACK);
		 for (int i = 0; i <= j; ++i) {
			 ball[i].draw(g);
         }
      }
   }

   /** The entry main method */
   public static void main(String[] args) {
      // Run GUI codes in Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new CGBouncingBallSwingTimer(); // Let the constructor do the job
         }
      });
   }
}