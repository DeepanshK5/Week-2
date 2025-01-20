public class BookClass {
    String title;
    String author;
    double price;

    // Default constructor
    public BookClass() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public BookClass(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }

    public static void main(String[] args) {
        // Using default constructor
        BookClass defaultBook = new BookClass();
        System.out.println("Title: " + defaultBook.title);
        System.out.println("Author: " + defaultBook.author);
        System.out.println("Price: " + defaultBook.price);

        // Using parameterized constructor
        Book1 parameterizedBook = new Book1("Java Programming", "Deepansh", 999);
        System.out.println("Title: " + parameterizedBook.title);
        System.out.println("Author: " + parameterizedBook.author);
        System.out.println("Price: " + parameterizedBook.price);
    }
}
