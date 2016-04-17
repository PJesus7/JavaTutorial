public class MyDate {
	private int year;
	private int month;
	private int day;

	private static String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun",
   										"Jul","Aug","Sep","Oct","Nov","Dec"};
	private static String[] strDays = {"Sunday","Monday","Tuesday","Wednesday",
										"Thursday","Friday","Saturday"};
	private static int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

	//static methods

	public static boolean isLeapYear(int year){
	return ((year%4 == 0 && year%100 !=0) || (year%400 == 0));
	}

	public static boolean isValidDate(int year, int month, int day){
		if (year < 1 || year > 9999) {return false;}
		if (month < 1 || month > 12) {return false;}
		if (day < 1 || day > 31) {return false;}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day == 31) {return false;}}

		if (month == 2) {
			if (isLeapYear(year)) {
			if (day > 29) {return false;}
		} else if (day > 28) {return false;}
		}
		return true;
	}

	public static int getDayOfWeek(int year, int month, int day) {
		int[] monthsTable = {0,3,3,6,1,4,6,2,5,0,3,5};
		int[] monthsTableLeap = {6,2,3,6,1,4,6,2,5,0,3,5};
		int res = 0;
		switch((year/100)%4) { //step 1
		case 0:
			res = 6; break;
		case 1:
			res = 4; break;
		case 2:
			res = 2; break;
		case 3:
			res = 0; break;
		}
		res += (year%100); //step 2
		res += (year%100)/4; //step 3
		if (isLeapYear(year)) {//step 4
			res += monthsTableLeap[month-1];}
			else {
				res += monthsTable[month-1];}
		res += day; //step 5
		res %= 7; //step 6

		return res;
	}

	//constructor
	public MyDate(int year, int month, int day) {
		setDate(year, month, day);
	}

	public void setDate(int year, int month, int day) {
		if (isValidDate(year,month,day)) {
			this.year = year;
			this.month = month;
			this.day = day;
      } else {
         throw new IllegalArgumentException("Invalid year, month or day!");
      }
	}

	//getters
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	//setters
	public void setYear(int year) {
		if (year>=1 && year <=9999) {
			this.year = year;
		} else {
		 throw new IllegalArgumentException("Invalid year!");
      }
	}

	public void setMonth(int month) {
		if (month>=1 && month <=12) {
			this.month = month;
		} else {
		 throw new IllegalArgumentException("Invalid month!");
      }
	}

	public void setDay(int day) {
		if (isValidDate(year,month,day)) {
			this.day = day;
		} else {
		 throw new IllegalArgumentException("Invalid day!");
      }
	}

	//toString
	public String toString() {
	      return strDays[getDayOfWeek(year,month,day)] + " " + day + " " + strMonths[month-1] + " " + year;
	}

	//next and before
   public MyDate nextDay() {
      day++;
      if (!isValidDate(year, month, day)) {
         day = 1;
         nextMonth();
	 }
      return this;
   }

      public MyDate nextMonth() {
            month++;
         if (!isValidDate(year, month, day)) {
			if (month == 13) {month = 1; nextYear();}
			if (month == 2 && isLeapYear(year) && day > 29) {day = 29;} else
            if (day > daysInMonths[month-1]) day = daysInMonths[month-1];
         }
         return this;
   }

      public MyDate nextYear() {
            year++;
         if (year > 9999) {throw new IllegalArgumentException("Year out of range!");}
            else {if (month == 2 && !isLeapYear(year)) {day = 28;}
		}
         return this;
   }

      public MyDate previousYear() {
            year--;
         if (year < 1) {throw new IllegalArgumentException("Year out of range!");}
            else {if (month == 2 && !isLeapYear(year)) {day = 28;}
		}
         return this;
   }

      public MyDate previousMonth() {
            month--;
         if (!isValidDate(year, month, day)) {
			if (month == 0) {month = 12; previousYear();}
			if (month == 2 && isLeapYear(year) && day > 29) {day = 29;} else
            if (day > daysInMonths[month-1]) day = daysInMonths[month-1];
         }
         return this;
   }

   public MyDate previousDay() {
      day--;
      if (day < 1) {
         if(month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11 || month == 1) {day = 31;} else
         if(month == 5 || month == 7 || month == 10 || month == 12) {day = 30;} else
         if(isLeapYear(year)) {day = 29;} else {day = 28;}
         previousMonth();
	 }
      return this;
   }

}