package hierarchicalinheritance.schoolsystem;

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println(this.name + " is a teacher who teaches " + this.subject + ".");
    }
}
