// A test driver program for the Book class
public class TestBookvar {
   public static void main(String[] args) {
		Bookvar javaDummy = new Bookvar("Java for Dummy", 19.99, 99);
		System.out.println(javaDummy);  // toString()
		System.out.print("The authors are: ");
		javaDummy.printAuthors();

		javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
		javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
		System.out.println(javaDummy);  // toString()
		System.out.print("The authors are: ");
		javaDummy.printAuthors();
		System.out.println();
		System.out.println();

		javaDummy.removeAuthorByName("Paul Tan");
		System.out.println(javaDummy);  // toString()
		System.out.print("The authors are: ");
		javaDummy.printAuthors();
		System.out.println();
		System.out.println();

		javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
		javaDummy.removeAuthorByName("Tan Ah Teck");
		System.out.println(javaDummy);  // toString()
		System.out.print("The authors are: ");
		javaDummy.printAuthors();
   }
}