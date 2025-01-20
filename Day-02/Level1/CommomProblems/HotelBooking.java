public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "";
        roomType = "";
        nights = 0;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        System.out.println("Guest Name: " + defaultBooking.guestName);
        System.out.println("Room Type: " + defaultBooking.roomType);
        System.out.println("Nights: " + defaultBooking.nights);

        // Using parameterized constructor
        HotelBooking customBooking = new HotelBooking("Deepansh", "Super-Deluxe", 3);
        System.out.println("Custom Booking:");
        System.out.println("Guest Name: " + customBooking.guestName);
        System.out.println("Room Type: " + customBooking.roomType);
        System.out.println("Nights: " + customBooking.nights);

        // Using copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        System.out.println("Guest Name: " + copiedBooking.guestName);
        System.out.println("Room Type: " + copiedBooking.roomType);
        System.out.println("Nights: " + copiedBooking.nights);
    }
}
