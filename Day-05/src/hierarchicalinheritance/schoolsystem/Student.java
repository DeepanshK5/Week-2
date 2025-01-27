package hierarchicalinheritance.schoolsystem;

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println(this.name + " is a student in grade " + this.grade + ".");
    }
}
