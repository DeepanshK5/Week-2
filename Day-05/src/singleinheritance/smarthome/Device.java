package singleinheritance.smarthome;

class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("singleinheritance.smarthome.Device id " + deviceId);
        System.out.println("Status " + status);
    }
}
