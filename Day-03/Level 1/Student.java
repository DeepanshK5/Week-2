class Student {
    static String universityName = "RGPV University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;


    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }


    static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("University " + universityName);
        System.out.println("Roll Number " + rollNumber);
        System.out.println("Name " + name);
        System.out.println("Grade " + grade);
    }


    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated");
        } else {
            System.out.println("Object is not instance of Student.");
        }
    }

    public static void main(String[] args) {
        // Creating students
        Student s1 = new Student(1, "Deepansh", "A");
        Student s2 = new Student(2, "Khare", "B");

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();

        // Displaying total students
        Student.displayTotalStudents();

        // Updating grade
        s1.updateGrade(s1, "A+");
        s1.displayDetails();

        // Trying to update grade with an invalid object
        String invalidObject = "Not a Student";
        s1.updateGrade(invalidObject, "B");
    }
}
