package assisted.employeehierarchy;

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee emp = new Employee("Employee", 1, 50000);
        emp.displayDetails();

        Manager manager = new Manager("Deepansh", 2, 800000, 100);
        manager.displayDetails();

        Developer developer = new Developer("Anubhav", 3, 70000, "Java");
        developer.displayDetails();

        Intern intern = new Intern("Om", 4, 20000, "TIT");
        intern.displayDetails();
    }
}
