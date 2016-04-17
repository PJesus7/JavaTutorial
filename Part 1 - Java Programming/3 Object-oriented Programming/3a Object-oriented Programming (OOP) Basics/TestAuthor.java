// A test driver for the Author class
public class TestAuthor {
   public static void main(String[] args) {
      Author teck = new Author("Tan Ah Teck", "teck@somewhere.com", 'm');
      System.out.println(teck);  // toString()
      teck.setEmail("teck@nowhere.com");
      System.out.println(teck);  // toString()
   }
}