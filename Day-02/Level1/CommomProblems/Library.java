public class Library {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Default constructor
    public Library() {
        title = "";
        author = "";
        price = 0.0;
        isAvailable = true;
    }

    // Parameterized constructor
    public Library(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book " + title + " has been borrowed.");
        } else {
            System.out.println("Sorry, the book " + title + " is not available.");
        }
    }

    public static void main(String[] args) {
        // Creating a book using parameterized constructor
        Library book = new Library("Maths", "Deepansh", 1000, true);
        System.out.println("Book Details:");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price);
        System.out.println("Available: " + book.isAvailable);

        // Borrowing the book
        System.out.println();
        book.borrowBook();

        // Trying to borrow the same book again
        System.out.println();
        book.borrowBook();
    }
}
