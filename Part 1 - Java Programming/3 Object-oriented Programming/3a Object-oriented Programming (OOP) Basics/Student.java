// The student class definition
public class Student {
   // Private member variables
   private String name;
   private String address;
   // Courses taken and grades for the courses are kept in 2 arrays of the same length
   private String[] courses;
   private int[] grades;     // A grade is between 0 to 100
   private int numCourses;   // Number of courses taken so far
   private static final int MAX_COURSES = 30;  // maximum courses
 
   // Constructor
   public Student(String name, String address) {
      this.name = name;
      this.address = address;
      courses = new String[MAX_COURSES];  // allocate arrays
      grades = new int[MAX_COURSES];
      numCourses = 0;                     // no courses so far
   }
 
   // Public getter for private variable name
   public String getName() {
      return name;
   }
 
   // Public getter for private variable address
   public String getAddress() {
      return address;
   }
 
   // Public setter for private variable address
   public void setAddress(String address) {
      this.address = address;
   }
 
   // Describe itself
   public String toString() {
      return name + "(" + address + ")";
   }
 
   // Add a course and grade
   public void addCourseGrade(String course, int grade) {
      courses[numCourses] = course;
      grades[numCourses] = grade;
      numCourses++;
   }
 
   // Print all courses taken and their grades
   public void printGrades() {
      System.out.print(this);   // student already has a toString()
      for (int i = 0; i < numCourses; i++) {
         System.out.print(" " + courses[i] + ":" + grades[i]);
      }
      System.out.println();
   }
 
   // Compute the average grade
   public double getAverageGrade() {
      int sum = 0;
      for (int i = 0; i < numCourses; i++ ) {
         sum += grades[i];
      }
      return (double)sum/numCourses;
   }
}