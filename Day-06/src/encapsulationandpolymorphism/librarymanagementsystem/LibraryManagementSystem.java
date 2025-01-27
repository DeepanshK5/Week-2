package encapsulationandpolymorphism.librarymanagementsystem;

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating library items
        Book book = new Book("B101", "The Great Book", "ABC");
        Magazine magazine = new Magazine("M202", "Maths", "Deepansh Khare");
        DVD dvd = new DVD("D303", "MIB", "HB");

        // Storing library items in an array
        LibraryItem[] items = {book, magazine, dvd};

        System.out.println("Library Item Details and Loan Information:");
        for (int i = 0; i < items.length; i++) {
            items[i].getItemDetails();
            System.out.println("Loan Duration: " + items[i].getLoanDuration());

            if (items[i] instanceof Reservable) {
                Reservable reservable = (Reservable) items[i];
                System.out.println("Is Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Is Available After Reservation: " + reservable.checkAvailability());
            }
        }
    }
}
