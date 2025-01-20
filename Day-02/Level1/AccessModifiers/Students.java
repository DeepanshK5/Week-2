// Students class
class Student1 {
    public int rollNumber;  // Public member
    protected String name;   // Protected member
    private double CGPA;     // Private member

    // Constructor to initialize student details
    public Student1(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostgraduateStudent subclass demonstrating protected member usage
class PostgraduateStudent extends Student1 {

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details
    public void displayGraduateName() {
        System.out.println("Post Graduation Name: " + name);  // Accessing the protected 'name'
    }
}

public class Students {
    public static void main(String[] args) {
        // Students class
        Student1 student = new Student1(45, "Deepansh", 9.0);
        student.displayStudentDetails();

        // PostgraduateStudent subclass
        PostgraduateStudent pgStudent = new PostgraduateStudent(45, "Deepansh", 9.2);
        pgStudent.displayGraduateName();
    }
}
