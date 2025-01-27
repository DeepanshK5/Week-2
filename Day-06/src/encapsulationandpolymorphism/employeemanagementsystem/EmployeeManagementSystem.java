package encapsulationandpolymorphism.employeemanagementsystem;

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Deepansh", 50000, 10000);
        fullTimeEmp.assignDepartment("IT");

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Anubhav", 100, 20);
        partTimeEmp.assignDepartment("Support");

        // Storing employees in an array
        Employee[] employees = {fullTimeEmp, partTimeEmp};


        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
            System.out.println("Department: " + ((Department) employees[i]).getDepartmentDetails());
            System.out.println("Total Salary: " + employees[i].calculateSalary());

        }
    }
}
