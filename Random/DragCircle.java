import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/** Test mouse-dragged */
@SuppressWarnings("serial")
public class DragCircle extends JFrame {
	public Ball ball;
	private int x=200, y=200, radius = 25;
	private JLabel statusBar;  // display the status
	boolean grabbed = false;

	/** Constructor to setup the GUI */
	public DragCircle() {

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

		// Allocate an instance of MyMouseDraggedListener
		// and used it as MouseListener and MouseMotionListener
		MyMouseDraggedListener listener = new MyMouseDraggedListener();
		drawPanel.addMouseListener(listener);
		drawPanel.addMouseMotionListener(listener);

		setContentPane(drawPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Drag Circle");
		setSize(500, 500);
		setVisible(true);
	}

	private class MyMouseDraggedListener extends MouseInputAdapter {
		@Override
		public void mousePressed(MouseEvent evt) {
			if (Math.abs(ball.x-evt.getX()) <= radius & Math.abs(ball.y-evt.getY()) <= radius) { //to make sure you only grab that piece
				grabbed = true;
				ball.x = evt.getX();
				ball.y = evt.getY();
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
			}
		}
	}

   /** The entry main method */
   public static void main(String[] args) {
      // Run GUI codes on the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new DragCircle();  // Let the constructor do the job
         }
      });
   }
}