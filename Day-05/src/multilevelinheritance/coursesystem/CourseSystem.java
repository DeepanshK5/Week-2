package multilevelinheritance.coursesystem;

public class CourseSystem {
    public static void main(String[] args) {
        Course course = new Course("Java", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Kotlin", 40, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("C++", 50, "Udacity", false, 20000, 20);

        course.displayInfo();
        System.out.println();
        onlineCourse.displayInfo();
        System.out.println();
        paidOnlineCourse.displayInfo();
    }
}
