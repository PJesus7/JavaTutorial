/** The Light Source, e.g. lighthouse */
import java.util.*;

public class Light {
   // Status - on (true) or off (false)
   private boolean on;
   // Listener list (people watching the light going on and off)
   private List<LightListener> listeners = new ArrayList<LightListener>();

   /** Constructor */
   public Light() {
      on = false;
      System.out.println("Light: constructed and off");
   }

   /** Add the given LightListener (someone new watching the light) */
   public void addLightListener(LightListener listener) {
      listeners.add(listener);
      System.out.println("Light: added a listener");
   }

   /** Remova the given LightListener */
   public void removeLightListener(LightListener listener) {
      listeners.remove(listener);
      System.out.println("Light: removed a listener");
   }

   /** Turn on this light */
   public void turnOn() {
      if (!on) {
         on = !on;
         System.out.println("Light: turn on");
         notifyListeners(); //watchers will do something when the light changes
      }
   }

   /** Turn off this light */
   public void turnOff() {
      if (on) {
         on = !on;
         System.out.println("Light: turn off");
         notifyListeners();
      }
   }

   /** Fire an LightEvent and notify all its registered listeners */
   private void notifyListeners() {
      LightEvent evt = new LightEvent(this); //just to create an event
      for (LightListener listener : listeners) {
         if (on) {
            listener.lightOn(evt);
         } else {
            listener.lightOff(evt);
         }
      }
   }
}