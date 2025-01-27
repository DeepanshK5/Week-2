package encapsulationandpolymorphism.librarymanagementsystem;

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String reservedBy;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
        this.reservedBy = null;
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for DVDs is 3 days
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = borrowerName;
            System.out.println("DVD reserved by " + borrowerName);
            return true;
        } else {
            System.out.println("DVD is already reserved.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
