package assisted.vehiclehierarchy;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed = " + this.maxSpeed + ", Fuel Type = " + this.fuelType);
    }
}
