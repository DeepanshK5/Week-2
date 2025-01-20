public class Employee {
    static String companyName = "DK";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Designation: " + this.designation);
            System.out.println("Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Deepansh", "Developer");
        Employee emp2 = new Employee(102, "Khare", "CEO");

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();

        Employee.displayTotalEmployees();
    }
}
