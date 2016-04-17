/** The LightListener interface */
import java.util.EventListener;
 
public interface LightListener extends EventListener {
   public void lightOn(LightEvent evt);  // called-back when the light has been turned on
   public void lightOff(LightEvent evt); // called-back when the light has been turned off
}