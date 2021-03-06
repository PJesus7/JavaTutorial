// The MyTime class definition
public class MyTime {    // "MyTime.java"
   // Private member variables
   private int hour;     // 0-23
   private int minute;   // 0-59
   private int second;   // 0-59
 
   // Constructor
   public MyTime(int hour, int minute, int second) {
      setTime(hour, minute, second);
   }
 
   void setTime(int hour, int minute, int second) {
      setHour(hour);
      setMinute(minute);
      setSecond(second);
   }
 
   // Setters which validates input with exception handling
   void setHour(int hour) {
      if (hour >= 0 && hour <= 23) {
         this.hour = hour;
      } else {
         throw new IllegalArgumentException("Invalid hour!");
      }
   }
 
   void setMinute(int minute) {
      if (minute >= 0 && minute <= 59) {
         this.minute = minute;
      } else {
         throw new IllegalArgumentException("Invalid minute!");
      }
   }
 
   void setSecond(int second) {
      if (second >= 0 && second <= 59) {
         this.second = second;
      } else {
         throw new IllegalArgumentException("Invalid second!");
      }
   }
 
   // Getters
   public int getHour() {
      return hour;
   }
 
   public int getMinute() {
      return minute;
   }
 
   public int getSecond() {
      return second;
   }
 
   // Return description in the format "hh:mm:ss" with leading zeros
   public String toString() {
      return String.format("%02d:%02d:%02d", hour, minute, second);
   }
 
   // Increment this instance to the next second, return this instance
   public MyTime nextSecond() {
      second++;
      if (second == 60) {
         second = 0;
         minute++;
      }
      if (minute == 60) {
         minute = 0;
         hour++;
      }
      if (hour == 24) {
         hour = 0;
      }
      return this;   // Return this instance, to support cascaded operation
   }
}