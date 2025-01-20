class Vehicle {
    static double registrationFee = 10000;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    // Constructor to initialize instance variables
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display registration details
    void displayRegistrationDetails() {
        if (this instanceof Vehicle) { // Checking if object is an instance of Vehicle
            System.out.println("Owner Name " + ownerName);
            System.out.println("Vehicle Type " + vehicleType);
            System.out.println("Registration Number " + registrationNumber);
            System.out.println("Registration Fee " + registrationFee);
        }
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Deepansh", "Jet", "MP123");
        Vehicle v2 = new Vehicle("Khare", "Space Station", "MP321");

        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

        updateRegistrationFee(150.0);

        // Displaying updated registration details
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}
