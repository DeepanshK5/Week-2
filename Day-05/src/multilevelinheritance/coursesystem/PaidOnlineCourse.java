package multilevelinheritance.coursesystem;

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee " + fee);
        System.out.println("Discount " + discount);
    }
}
