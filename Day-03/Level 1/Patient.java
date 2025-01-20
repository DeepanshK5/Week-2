class Patient {
    // Static variable
    static String hospitalName = "Ramansh Hospital";

    // Final variable
    final int patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Static variable to keep count of total patients
    static int totalPatients = 0;

    // Constructor
    Patient(String name, int age, String ailment) {
        this.patientID = ++totalPatients;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Static method to get total number of patients
    static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details if the object is an instance of Patient
    void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        } else {
            System.out.println("The object is not an instance of Patient.");
        }
    }

    public static void main(String[] args) {
        // Creating Patient objects
        Patient p1 = new Patient("Deepansh", 45, "Fever");
        Patient p2 = new Patient("Anubhav", 33, "Headache");

        // Displaying total patients
        System.out.println("Total Patients: " + Patient.getTotalPatients());

        // Displaying details of patients
        p1.displayDetails(p1);
        p2.displayDetails(p2);
    }
}
