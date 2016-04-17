import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, WindowListener {

	// Private variables
	private TextField tfMouseX; // to display mouse-click-x
	private TextField tfMouseY; // to display mouse-click-y

	// Constructor - Setup the UI
	public MouseEventDemo() {
		setLayout(new FlowLayout()); // "this" frame sets layout

		// Label
		add(new Label("X-Click: ")); // "this" frame adds component

      // TextField
		tfMouseX = new TextField(10); // 10 columns
		tfMouseX.setEditable(false);  // read-only
		add(tfMouseX); // "this" frame adds component

		// Label
		add(new Label("Y-Click: ")); // "this" frame adds component

		// TextField
		tfMouseY = new TextField(10);
		tfMouseY.setEditable(false);  // read-only
		add(tfMouseY); // "this" frame adds component

		this.addMouseListener(this);
		// "this" frame fires the MouseEvent
		// "this" frame adds "this" object as MouseEvent listener

		addWindowListener(this);

		setTitle("MouseEvent Demo"); // "this" Frame sets title
		setSize(350, 100);      // "this" Frame sets initial size
		setVisible(true);       // "this" Frame shows
	}

	public static void main(String[] args) {
		new MouseEventDemo();  // Let the constructor do the job
   }

	// MouseEvent handlers
	@Override
	public void mouseClicked(MouseEvent e) {
		tfMouseX.setText(e.getX() + "");
		tfMouseY.setText(e.getY() + "");
	}

	@Override
	public void mousePressed(MouseEvent e) { }
	@Override
	public void mouseReleased(MouseEvent e) { }
	@Override
	public void mouseEntered(MouseEvent e) { }
	@Override
	public void mouseExited(MouseEvent e) { }

	/** WindowEvent handlers */
	// Called back upon clicking close-window button
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);  // terminate the program
	}

	// Not Used, but need to provide an empty body for compilation
	@Override
	public void windowOpened(WindowEvent e) { }
	@Override
	public void windowClosed(WindowEvent e) { }
	@Override
	public void windowIconified(WindowEvent e) { }
	@Override
	public void windowDeiconified(WindowEvent e) { }
	@Override
	public void windowActivated(WindowEvent e) { }
	@Override
	public void windowDeactivated(WindowEvent e) { }
}