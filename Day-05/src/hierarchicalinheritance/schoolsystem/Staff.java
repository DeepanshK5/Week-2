package hierarchicalinheritance.schoolsystem;

class Staff extends Person {
    String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayRole() {
        System.out.println(this.name + " is a staff member with the position of " + this.position + ".");
    }
}
