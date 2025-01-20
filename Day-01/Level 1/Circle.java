public class Circle {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area
    double calculateArea() {
        return 3.14159 * radius * radius;
    }

    // Method to calculate and return the circumference
    double calculateCircumference() {
        return 2 * 3.14159 * radius;
    }

    // Method to display the area and circumference
    void displayDetails() {
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        // Create a Circle object with a given radius
        Circle circle = new Circle(7.0);

        // Display the area and circumference of the circle
        circle.displayDetails();
    }
}
