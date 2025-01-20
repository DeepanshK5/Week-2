public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    public CarRental() {
        customerName = "";
        carModel = "";
        rentalDays = 0;
        dailyRate = 500; // Default daily rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        System.out.println("Customer Name: " + defaultRental.customerName);
        System.out.println("Car Model: " + defaultRental.carModel);
        System.out.println("Rental Days: " + defaultRental.rentalDays);
        System.out.println("Daily Rate: $" + defaultRental.dailyRate);
        System.out.println("Total Cost: $" + defaultRental.calculateTotalCost());

        // Using parameterized constructor
        CarRental customRental = new CarRental("Deepansh", "A1", 5, 100.0);
        System.out.println("Custom Rental:");
        System.out.println("Customer Name: " + customRental.customerName);
        System.out.println("Car Model: " + customRental.carModel);
        System.out.println("Rental Days: " + customRental.rentalDays);
        System.out.println("Daily Rate: $" + customRental.dailyRate);
        System.out.println("Total Cost: $" + customRental.calculateTotalCost());
    }
}
