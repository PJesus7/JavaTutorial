import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.ExecutionException;
import javax.swing.*;

/** Test SwingWorker on the counter application with a compute-intensive task */
@SuppressWarnings("serial")
public class SwingWorkerCounterProgress extends JPanel {
   // For counter
   private JTextField tfCount;
   private int count = 0;
   // For SwingWorker
   JButton btnStartWorker;   // to start the worker
   private JLabel lblWorker; // for displaying the result
   JProgressBar pbWorker;    // progress bar for the worker task

   /** Constructor to setup the GUI components */
   public SwingWorkerCounterProgress () {
      setLayout(new FlowLayout());

      add(new JLabel("Counter"));
      tfCount = new JTextField("0", 10);
      tfCount.setEditable(false);
      add(tfCount);

      JButton btnCount = new JButton("Count");
      add(btnCount);
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            ++count;
            tfCount.setText(count + "");
         }
      });

      /** Create a SwingWorker instance to run a compute-intensive task */
      final SwingWorker<String, String> worker = new SwingWorker<String, String>() {

         /** Schedule a compute-intensive task in a background thread */
         @Override
         protected String doInBackground() throws Exception {
            long sum = 0;
            int maxNumber = 10000000;
            for (int number = 0; number < maxNumber; ++number) {
               sum += number;
               publish(sum + ""); // send intermediate result to process()
               // Fire PropertyChangeEvent for the bound-property "progress"
               setProgress(100 * (number + 1) / maxNumber);
            }
            return sum + "";
         }

         /** Run in event-dispatching thread after doInBackground() completes */
         @Override
         protected void done() {
            try {
               // Use get() to get the result of doInBackground()
               String finalResult = get();
               // Display the result in the label (run in EDT)
               lblWorker.setText("Final Result is " + finalResult);
            } catch (InterruptedException e) {
               e.printStackTrace();
            } catch (ExecutionException e) {
               e.printStackTrace();
            }
         }

         /** Run in event-dispatching thread to process intermediate results
              send from publish(). */
         @Override
         protected void process(java.util.List<String> chunks) {
            // Get the latest result from the list
            String latestResult = chunks.get(chunks.size() - 1);
            lblWorker.setText("Result is " + latestResult);
         }
      };

      /** Event handler for the PropertyChangeEvent of property "progress" */
      worker.addPropertyChangeListener(new PropertyChangeListener() {
         @Override
         public void propertyChange(PropertyChangeEvent evt) {
            if (evt.getPropertyName().equals("progress")) {  // check the property name
               pbWorker.setValue((Integer)evt.getNewValue());  // update progress bar
            }
         }
      });

      btnStartWorker = new JButton("Start Worker");
      add(btnStartWorker);
      btnStartWorker.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            worker.execute();  // start the worker thread
            lblWorker.setText("  Running...");
            btnStartWorker.setEnabled(false);  // SwingWorker can only run once
         }
      });
      lblWorker = new JLabel("  Not started...");
      add(lblWorker);
      pbWorker = new JProgressBar();
      add(pbWorker);
   }

   /** The entry main() method */
   public static void main(String[] args) {
      // Run the GUI construction in the Event-Dispatching thread for thread-safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            JFrame frame = new JFrame("SwingWorker Test");
            frame.setContentPane(new SwingWorkerCounterProgress());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setVisible(true);
         }
      });
   }
}