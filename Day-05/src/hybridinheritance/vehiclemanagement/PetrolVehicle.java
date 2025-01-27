package hybridinheritance.vehiclemanagement;

// Subclass hierarchicalinheritance.vehiclemanagement.PetrolVehicle inheriting from Vehicle and implementing hierarchicalinheritance.vehiclemanagement.Refuelable
class PetrolVehicle extends Vehicle1 implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling");
    }
}
