class Employee1 {
    String name;
    int id;
    double salary;

    // Constructor to initialize Employee attributes
    Employee1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display Employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee1 emp = new Employee1("Alice", 101, 50000.00);

        // Display the details of the Employee
        emp.displayDetails();
    }
}
