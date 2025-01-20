class Book1 {
    String title;
    String author;
    double price;

    // Constructor to initialize Book attributes
    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display Book details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        // Create a Book object
        Book1 book1 = new Book1("The Alchemist", "Paulo Coelho", 299.99);

        // Display the details of the Book
        book1.displayDetails();
    }
}
