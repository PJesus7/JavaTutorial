public class MyTime {
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

   // Increments
   public MyTime nextSecond() {
      second++;
      if (second == 60) {
         second = 0;
         nextMinute();
	 }
      return this;   // Return this instance, to support cascaded operation
   }

      public MyTime nextMinute() {
            minute++;
         if (minute == 60) {
            minute = 0;
            nextHour();
         }
         return this;   // Return this instance, to support cascaded operation
   }

      public MyTime nextHour() {
            hour++;
         if (hour == 24) {
            hour = 0;
         }
         return this;   // Return this instance, to support cascaded operation
   }

   // Decrements
      public MyTime previousHour() {
            hour--;
         if (hour == -1) {
            hour = 23;
         }
         return this;   // Return this instance, to support cascaded operation
   }

      public MyTime previousMinute() {
            minute--;
         if (minute == -1) {
            minute = 59;
            previousHour();
         }
         return this;   // Return this instance, to support cascaded operation
   }

	public MyTime previousSecond() {
      second--;
      if (second == -1) {
         second = 59;
         previousMinute();
	 }
      return this;   // Return this instance, to support cascaded operation
   }
}