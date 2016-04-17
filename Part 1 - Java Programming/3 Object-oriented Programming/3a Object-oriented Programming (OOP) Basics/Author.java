// The Author class definition
public class Author {
   // Private variables
   private String name;
   private String email;
   private char gender;
 
   // Constructor
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
 
   // Public getters and setters for private variables
   public String getName() {
      return name;
   }
 
   public String getEmail() {
      return email;
   }
 
   public char getGender() {
      return gender;
   }
 
   public void setEmail(String email) {
      this.email = email;
   }
 
   // toString() to describe itself
   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
}