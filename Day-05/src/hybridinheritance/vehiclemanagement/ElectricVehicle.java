package hybridinheritance.vehiclemanagement;

// Subclass hierarchicalinheritance.vehiclemanagement.ElectricVehicle inheriting from Vehicle
class ElectricVehicle extends Vehicle1 {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}
