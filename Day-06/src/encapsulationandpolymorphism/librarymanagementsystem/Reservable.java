package encapsulationandpolymorphism.librarymanagementsystem;

// Reservable Interface
interface Reservable {
    boolean reserveItem(String borrowerName);

    boolean checkAvailability();
}
