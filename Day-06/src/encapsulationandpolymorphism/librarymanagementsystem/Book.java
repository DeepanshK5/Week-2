package encapsulationandpolymorphism.librarymanagementsystem;

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String reservedBy;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
        this.reservedBy = null;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = borrowerName;
            System.out.println("Book reserved by " + borrowerName);
            return true;
        } else {
            System.out.println("Book is already reserved.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
