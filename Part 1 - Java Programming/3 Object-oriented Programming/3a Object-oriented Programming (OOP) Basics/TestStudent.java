// A test driver program for the Student class
public class TestStudent {
   public static void main(String[] args) {
      Student ahTeck = new Student("Tan Ah Teck", "1 Happy Ave");
      ahTeck.addCourseGrade("IM101", 89);
      ahTeck.addCourseGrade("IM102", 57);
      ahTeck.addCourseGrade("IM103", 96);
      ahTeck.printGrades();
      System.out.printf("The average grade is %.2f", ahTeck.getAverageGrade());
   }
}