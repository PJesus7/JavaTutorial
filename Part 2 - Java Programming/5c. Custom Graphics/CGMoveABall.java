import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Custom Graphics Example: Using key/button to move a line left or right.
 */
@SuppressWarnings("serial")
public class CGMoveABall extends JFrame {
   // Name-constants for the various dimensions
   public static final int CANVAS_WIDTH = 400;
   public static final int CANVAS_HEIGHT = CANVAS_WIDTH;
   public static final Color LINE_COLOR = Color.RED;
   public static final Color CANVAS_BACKGROUND = Color.CYAN;

   // The ball at (x, y) with radius r initially position at the center
   private int x = CANVAS_WIDTH / 2;
   private int y = x;
   private int r = CANVAS_WIDTH / 10;

   private DrawCanvas canvas; // the custom drawing canvas (extends JPanel)

   /** Constructor to set up the GUI */
   public CGMoveABall() {
      // Set up a panel for the buttons
      JPanel btnPanel = new JPanel(new GridLayout(0,1));

      JPanel upPanel = new JPanel(new FlowLayout());
      JButton btnUp = new JButton("Move Up ");
      upPanel.add(btnUp);
      btnUp.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            y -= 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });

      JPanel middlePanel = new JPanel(new FlowLayout());
      JButton btnLeft = new JButton("Move Left ");
      middlePanel.add(btnLeft);
      btnLeft.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            x -= 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      JButton btnRight = new JButton("Move Right");
      middlePanel.add(btnRight);
      btnRight.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            x += 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });

      JPanel bottomPanel = new JPanel(new FlowLayout());
      JButton btnDown = new JButton("Move Down ");
      bottomPanel.add(btnDown);
      btnDown.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            y += 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      btnPanel.add(upPanel);
      btnPanel.add(middlePanel);
      btnPanel.add(bottomPanel);

      // Set up a custom drawing JPanel
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

      // Add both panels to this JFrame
      Container cp = getContentPane();
      cp.setLayout(new BorderLayout());
      cp.add(canvas, BorderLayout.CENTER);
      cp.add(btnPanel, BorderLayout.SOUTH);

      // "this" JFrame fires KeyEvent
      addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent evt) {
            switch(evt.getKeyCode()) {
               case KeyEvent.VK_UP:
                  y -= 10;
                  repaint();
                  break;
               case KeyEvent.VK_LEFT:
                  x -= 10;
                  repaint();
                  break;
               case KeyEvent.VK_RIGHT:
                  x += 10;
                  repaint();
                  break;
               case KeyEvent.VK_DOWN:
                  y += 10;
                  repaint();
                  break;
            }
         }

		@Override
		public void keyTyped(KeyEvent e) {
			switch (e.getKeyChar()) {
      			case 'w':
      				y -= 10;
                	repaint();
                break;
      			case 'a':
      				x -= 10;
                	repaint();
                break;
      			case 'd':
      				x += 10;
                	repaint();
                break;
      			case 's':
      				y += 10;
                	repaint();
                break;
   				}
			}
      });

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle the CLOSE button
      setTitle("Move a Line");
      pack();           // pack all the components in the JFrame
      setVisible(true); // show it
      requestFocus();   // set the focus to JFrame to receive KeyEvent
   }

   /**
    * DrawCanvas (inner class) is a JPanel used for custom drawing
    */
   class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         setBackground(CANVAS_BACKGROUND);
         g.setColor(LINE_COLOR);
         g.fillOval(x - r, y - r, 2*r, 2*r); // draw the circle
      }
   }

   /** The entry main() method */
   public static void main(String[] args) {
      // Run GUI codes on the Event-Dispatcher Thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new CGMoveABall(); // Let the constructor do the job
         }
      });
   }
}