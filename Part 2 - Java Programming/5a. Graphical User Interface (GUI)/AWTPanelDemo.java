import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTPanelDemo extends Frame {
   private Button[] btnNumbers = new Button[10];  // Array of 10 numeric buttons
   private Button btnHash, btnStar;
   private TextField tfDisplay;
 
   /** Constructor to setup GUI components */
   public AWTPanelDemo () {
      // Set up display panel
      Panel panelDisplay = new Panel(new FlowLayout());
      tfDisplay = new TextField("0", 20);
      panelDisplay.add(tfDisplay);
 
      // Set up button panel
      Panel panelButtons = new Panel(new GridLayout(4, 3));
      btnNumbers[1] = new Button("1");
      panelButtons.add(btnNumbers[1]);
      btnNumbers[2] = new Button("2");
      panelButtons.add(btnNumbers[2]);
      btnNumbers[3] = new Button("3");
      panelButtons.add(btnNumbers[3]);
      btnNumbers[4] = new Button("4");
      panelButtons.add(btnNumbers[4]);
      btnNumbers[5] = new Button("5");
      panelButtons.add(btnNumbers[5]);
      btnNumbers[6] = new Button("6");
      panelButtons.add(btnNumbers[6]);
      btnNumbers[7] = new Button("7");
      panelButtons.add(btnNumbers[7]);
      btnNumbers[8] = new Button("8");
      panelButtons.add(btnNumbers[8]);
      btnNumbers[9] = new Button("9");
      panelButtons.add(btnNumbers[9]);
         // Can use a loop for the above statements!
      btnStar = new Button("*");
      panelButtons.add(btnStar);
      btnNumbers[0] = new Button("0");
      panelButtons.add(btnNumbers[0]);
      btnHash = new Button("#");
      panelButtons.add(btnHash);
 
      setLayout(new BorderLayout());  // "this" Frame sets to BorderLayout
      add(panelDisplay, BorderLayout.NORTH);
      add(panelButtons, BorderLayout.CENTER);
 
      setTitle("BorderLayout Demo"); // "this" Frame sets title
      setSize(200, 200);        // "this" Frame sets initial size
      setVisible(true);         // "this" Frame shows
   }
 
   /** The entry main() method */
   public static void main(String[] args) {
      new AWTPanelDemo();  // Let the constructor do the job
   }
}