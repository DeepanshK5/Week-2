package encapsulationandpolymorphism.vehiclerentalsystem;

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating vehicle objects
        Car car = new Car("A123", 1000, 5, "CAR123");
        Bike bike = new Bike("B456", 500, 2, "BIKE456");
        Truck truck = new Truck("C789", 2000, 500);

        // Storing vehicles in an array
        Vehicle[] vehicles = {car, bike, truck};

        System.out.println("Vehicle Rental and Insurance Details:");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayDetails();
            int rentalDays = 5; // Example rental period

            double rentalCost = vehicles[i].calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicles[i] instanceof Insurable) {
                System.out.println(((Insurable) vehicles[i]).getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable) vehicles[i]).calculateInsurance());
            }
        }
    }
}
