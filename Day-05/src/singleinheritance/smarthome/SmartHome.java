package singleinheritance.smarthome;

public class SmartHome {
    public static void main(String[] args) {
        Device device = new Device("D1", "Active");
        Thermostat thermostat = new Thermostat("T1", "Active", 22);

        device.displayStatus();
        thermostat.displayStatus();
    }
}
