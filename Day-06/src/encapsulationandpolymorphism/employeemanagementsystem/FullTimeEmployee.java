package encapsulationandpolymorphism.employeemanagementsystem;

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department != null ? department : "No department assigned.";
    }
}
