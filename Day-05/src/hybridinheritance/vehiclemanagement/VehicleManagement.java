package hybridinheritance.vehiclemanagement;

// Test the system
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota");

        ev.charge();
        pv.refuel();
    }
}
