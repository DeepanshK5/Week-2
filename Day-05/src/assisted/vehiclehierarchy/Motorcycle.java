package assisted.vehiclehierarchy;

class Motorcycle extends Vehicle {
    boolean hasDiscBrake;

    Motorcycle(int maxSpeed, String fuelType, boolean hasDiscBrake) {
        super(maxSpeed, fuelType);
        this.hasDiscBrake = hasDiscBrake;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier = " + this.hasDiscBrake);
    }
}
