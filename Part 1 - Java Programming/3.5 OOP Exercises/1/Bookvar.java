// The Book class definition
public class Bookvar {
   // Private variables
   private String name;
   private Author[] authors = new Author[5];
   private int numAuthors = 0;
   private double price;
   private int qtyInStock;

   // Constructors
   public Bookvar(String name, double price) {
      this.name = name;
      this.price = price;
      this.qtyInStock = 0;   // Not given, set to the default value
   }

   public Bookvar(String name, double price, int qtyInStock) {
      this.name = name;
      this.price = price;
      this.qtyInStock = qtyInStock;
   }

   // Getters and Setters
   public String getName() {
      return name;
   }

   public Author[] getAuthors() {
      return authors;   // return member author, which is an instance of class Author
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getQtyInStock() {
      return qtyInStock;
   }

   public void setQtyInStock(int qtyInStock) {
      this.qtyInStock = qtyInStock;
   }

   public void addAuthor(Author author) {
         authors[numAuthors] = author;
         numAuthors++;
   }

   public boolean removeAuthorByName(String authorName) {
	   boolean remove = false; int i = 0;
	   while (i<numAuthors) {
		   if (authors[i].getName().equals(authorName)) {remove = true;numAuthors--;}
		   if (remove == true) {authors[i]=authors[i+1];}
	   i++;}
	   return remove;
   }

   // toString() t describe itself
   public String toString() {
      return "'" + name + "' by " + numAuthors + " authors.";  // author.toString()
   }

   public void printAuthors() {
	  for (int i = 0; i< numAuthors; i++) {
	System.out.print(authors[i].getName() + ";");}
	}
}