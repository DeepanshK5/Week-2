public class CircleClass {
    double radius;

    // Default constructor
    public CircleClass() {
        this(1.0); // Calls the parameterized constructor with a default radius of 1.0
    }

    // Parameterized constructor
    public CircleClass(double r) {
        this.radius = r;
    }

    public static void main(String[] args) {
        // Using default constructor
        CircleClass defaultCircle = new CircleClass();
        System.out.println("Default Circle Radius: " + defaultCircle.radius);

        // Using parameterized constructor
        CircleClass customCircle = new CircleClass(5.5);
        System.out.println("Custom Circle Radius: " + customCircle.radius);
    }
}
