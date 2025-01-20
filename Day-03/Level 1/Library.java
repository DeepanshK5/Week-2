class Book {
    final String ISBN;
    protected String title;
    private String author;

    static String libraryName = "TIT Library";

    public static void dispalyLibraryName(){
        System.out.println("Name is "+libraryName);
    }

    // Constructor to initialize the book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author's name
    public String getAuthor() {
        return this.author;
    }

    public void displayDetails(){
        if(this instanceof Book){
            System.out.println("Title is "+this.title);
            System.out.println("ISBN is "+this.ISBN);
            System.out.println("Author is "+this.author);
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Book book = new Book("1234567890", "Java Programming", "Deepansh");

        // Displaying details of the eBook
        book.displayDetails();

        // Using getter and setter for author name
        System.out.println("Author: " + book.getAuthor());
        book.setAuthor("Deepansh Khare");
        System.out.println("Updated Author: " + book.getAuthor());
    }
}
