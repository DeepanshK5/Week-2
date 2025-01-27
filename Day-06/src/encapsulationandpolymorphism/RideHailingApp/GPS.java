package encapsulationandpolymorphism.RideHailingApp;

// GPS Interface
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}
