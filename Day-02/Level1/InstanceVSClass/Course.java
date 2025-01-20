public class Course {

    //Instance Variable
    String courseName;
    double duration;
    double fee;

    //Class Variable
    static String instituteName;

    // Parameterized constructor
    Course(String courseName,double duration, double fee){
        this.courseName=courseName;
        this.fee=fee;
        this.duration=duration;
    }

    //Method
    public void displayCourseDetails(){
        System.out.println("The name of Course is "+this.courseName);
        System.out.println("The duration of Course is "+this.duration);
        System.out.println("The fee of Course is "+this.fee);
    }

    public static void updateInstituteName(String newName){
        Course.instituteName = newName;
        System.out.println("Institute name is "+Course.instituteName);
    }

    //Main Method
    public static void main(String[] args) {
        Course.updateInstituteName("TIT");

        Course course1 = new Course("CSE",4,110000);
        Course course2 = new Course("EX",4,70000);
        Course course3 = new Course("EC",4,65000);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
