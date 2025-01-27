package encapsulationandpolymorphism.vehiclerentalsystem;

// Truck class
class Truck extends Vehicle {
    private double cargoRate;

    public Truck(String vehicleNumber, double rentalRate, double cargoRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.cargoRate = cargoRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() + cargoRate) * days;
    }
}
