// The Book class definition
public class Book {
   // Private variables
   private String name;
   private Author[] authors;
   private double price;
   private int qtyInStock;

   // Constructors
   public Book(String name, Author[] authors, double price) {
      this.name = name;
      this.authors = authors;
      this.price = price;
      this.qtyInStock = 0;   // Not given, set to the default value
   }

   public Book(String name, Author[] authors, double price, int qtyInStock) {
      this.name = name;
      this.authors = authors;
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

   // toString() t describe itself
   public String toString() {
      return "'" + name + "' by " + authors.length + " authors.";  // author.toString()
   }

   public void printAuthors() {
	   for (Author author : authors) {
	System.out.print(author.getName() + ";");}
	}
}