package encapsulationandpolymorphism.RideHailingApp;

// Main Class
public class RideHailingApp {
    public static void main(String[] args) {
        // Creating vehicles
        Car car = new Car("C1", "A", 12, "Area1");
        Bike bike = new Bike("B1", "B", 8, "Area2");
        Auto auto = new Auto("A1", "C", 10, "Area3");

        // Storing vehicles in an array
        Vehicle[] vehicles = {car, bike, auto};

        // Calculating fares and displaying details
        System.out.println("Ride-Hailing Application:");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].getVehicleDetails();
            double fare = vehicles[i].calculateFare(15.0); // Example distance: 15 km
            System.out.println("Fare for 15 km: " + fare);

            if (vehicles[i] instanceof GPS) {
                GPS gps = (GPS) vehicles[i];
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Destination");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
        }
    }
}
