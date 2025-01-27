package multilevelinheritance.coursesystem;

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform " + platform);
        System.out.println("Recorded " + isRecorded);
    }
}
