public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0; // Class variable, fixed registration fee

    // Constructor
    public Vehicle(String Name, String Type) {
        this.ownerName = Name;
        this.vehicleType = Type;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Thar", "Car");

        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(150.0);
        v1.displayVehicleDetails();
    }
}
