package assisted.employeehierarchy;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name = " + this.name + ", ID = " + this.id + ", Salary = " + this.salary);
    }
}
