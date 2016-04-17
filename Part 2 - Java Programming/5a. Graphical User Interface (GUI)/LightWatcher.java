/** An implementation of LightListener class */
public class LightWatcher implements LightListener {
   private int id;  // ID of this listner
 
   /** Constructor */
   public LightWatcher(int id) {
      this.id = id;
      System.out.println("LightWatcher-" + id + ": created");
   }
 
   /** Implementation of event handlers */
   @Override
   public void lightOn(LightEvent evt) {
      System.out.println("LightWatcher-" + id
         + ": I am notified that light is on");
   }
 
   @Override
   public void lightOff(LightEvent evt) {
      System.out.println("LightWatcher-" + id
         + ": I am notified that light is off");
   }
}