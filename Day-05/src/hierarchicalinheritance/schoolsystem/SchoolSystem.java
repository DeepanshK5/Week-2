package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Person person = new Person("ABC", 25);
        Teacher teacher = new Teacher("Deepansh", 22, "Math");
        Student student = new Student("Anubhav", 18, 12);
        Staff staff = new Staff("hierarchicalinheritance.schoolsystem.Staff 1", 30, "Developer");

        person.displayRole();
        System.out.println();

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}
