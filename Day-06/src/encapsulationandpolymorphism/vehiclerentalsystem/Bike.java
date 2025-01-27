package encapsulationandpolymorphism.vehiclerentalsystem;

// Bike class
class Bike extends Vehicle implements Insurable {
    private double insuranceRate;
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, double insuranceRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insuranceRate = insuranceRate;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate * getRentalRate();
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber + ", Insurance Rate: " + insuranceRate;
    }
}
