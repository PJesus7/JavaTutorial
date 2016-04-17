public class TestMyDate {
   public static void main(String[] args) {

MyDate d1 = new MyDate(2012, 2, 28);
System.out.println(d1);             // Tuesday 28 Feb 2012
System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
System.out.println(d1.previousDay()); // Wednesday 29 Feb 2012
System.out.println(d1.previousYear()); // Monday 28 Feb 2011

MyDate d2 = new MyDate(2012, 1, 2);
System.out.println(d2);                 // Monday 2 Jan 2012
System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

MyDate d3 = new MyDate(2011, 12, 28);
	while(!(d3.getDay() ==3 && d3.getMonth()== 3 && d3.getYear()== 2012)) {
	System.out.println(d3.nextDay());
	}
	while(!(d3.getDay() ==28 && d3.getMonth()== 12 && d3.getYear()== 2011)) {
	System.out.println(d3.previousDay());
	}

   }
}