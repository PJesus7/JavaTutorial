import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/** Test mouse-dragged */
@SuppressWarnings("serial")
public class ThrowCircle extends JFrame {
	public Ball ball;
	private int x=200, y=200, radius = 25;
	private JLabel statusBar;  // display the status
	boolean grabbed = false;

	float x0,y0, xSpeed=0, ySpeed=0;
    long start; // Get current time

   private static final int CANVAS_WIDTH = 640;
   private static final int CANVAS_HEIGHT = 480;
   private static final int UPDATE_INTERVAL = 10; // milliseconds



	/** Constructor to setup the GUI */
	public ThrowCircle() {

		ball = new Ball(x,y,radius);
		// Define an anonymous inner class extends JPanel for custom drawing
		// and allocate an instance
		JPanel drawPanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);  // paint parent's background
				ball.draw(g);
			}
		};

		statusBar = new JLabel();
		drawPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		drawPanel.add(statusBar);

		// Allocate an instance of MyMouseDraggedListener
		// and used it as MouseListener and MouseMotionListener
		MyMouseDraggedListener listener = new MyMouseDraggedListener();
		drawPanel.addMouseListener(listener);
		drawPanel.addMouseMotionListener(listener);

		setContentPane(drawPanel);
		drawPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		setSize(CANVAS_WIDTH, CANVAS_HEIGHT+40);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Drag Circle");
		setVisible(true);

		Thread updateThread = new Thread() {
			@Override
			public void run() {
				while (true) {
						update();   // update the (x, y) position
						repaint();  // Refresh the JFrame. Called back paintComponent()
					try {
					// Delay and give other thread a chance to run
						Thread.sleep(UPDATE_INTERVAL);  // milliseconds
					} catch (InterruptedException ignore) {}
				}
			}
		};
		updateThread.start(); // called back run()*/
	}

	private class MyMouseDraggedListener extends MouseInputAdapter {
		@Override
		public void mousePressed(MouseEvent evt) {
				xSpeed = 0; ySpeed = 0;
			if (Math.abs(ball.x-evt.getX()) <= radius & Math.abs(ball.y-evt.getY()) <= radius) { //to make sure you only grab that piece
				grabbed = true; xSpeed = 0; ySpeed = 0;
				ball.x = evt.getX(); x0 = evt.getX();
				ball.y = evt.getY(); y0 = evt.getY();
				statusBar.setText("(" + x0 + "," + y0 + ")");
				start = System.currentTimeMillis(); // Get current time
			}
		}
		@Override
		public void mouseDragged(MouseEvent evt) {
			if (grabbed) {
				ball.x = evt.getX();
				ball.y = evt.getY();
				repaint();  // Called back paintComponent()
			}
		}
		@Override
		public void mouseReleased(MouseEvent evt) {
			if (grabbed) {
				ball.x = evt.getX();
				ball.y = evt.getY();
				repaint();  // Called back paintComponent()
				grabbed = false;
				long elapsedTime = System.currentTimeMillis()-start;
				float time = elapsedTime/UPDATE_INTERVAL; //get time in UPDATE_INTERVAL, since we want the ball to move every UPDATE_INTERVAL.
				xSpeed = (evt.getX() - x0)/time; //vel (s) = dist / time (s); vel(UPDATE_INTERVAL) = dist / time (UPDATE_INTERVAL)
				ySpeed = (evt.getY() - y0)/time;
				statusBar.setText("position:(" + evt.getX() + "," + evt.getY() + "). Velocity:(" + xSpeed + "," + ySpeed + ")");
			}
		}
	}

	public void update() {
		ball.x += xSpeed;
		ball.y += ySpeed;
		if (Math.abs(xSpeed) <= 0.01 & Math.abs(ySpeed) <= 0.01) {
			xSpeed = 0;	ySpeed = 0;
		} else {
			xSpeed *= 0.99;	ySpeed *= 0.99;}
		statusBar.setText("Velocity:(" + xSpeed + "," + ySpeed + ")");
		if (ball.x > CANVAS_WIDTH - ball.radius || ball.x - ball.radius < 0) {
			xSpeed = -xSpeed;
		}
		if (ball.y > CANVAS_HEIGHT - ball.radius || ball.y - ball.radius < 0) {
			ySpeed = -ySpeed;
		}
	}

   /** The entry main method */
   public static void main(String[] args) {
      // Run GUI codes on the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new ThrowCircle();  // Let the constructor do the job
         }
      });
   }
}

/*   // Get current time
    long start = System.currentTimeMillis();

    // Get elapsed time in milliseconds
    long elapsedTimeMillis = System.currentTimeMillis()-start;

    // Get elapsed time in seconds
    float elapsedTimeSec = elapsedTimeMillis/1000F;

 */