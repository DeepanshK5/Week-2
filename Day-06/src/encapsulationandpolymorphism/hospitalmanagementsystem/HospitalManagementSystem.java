package encapsulationandpolymorphism.hospitalmanagementsystem;

// Main Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patients
        InPatient inPatient = new InPatient("P1", "ABC", 30, 2000, 2);
        OutPatient outPatient = new OutPatient("P2", "DEF", 25, 500);

        // Adding medical records
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-operative care");

        outPatient.addRecord("Routine checkup");
        outPatient.addRecord("Flu treatment");

        // Storing patients in an array
        Patient[] patients = {inPatient, outPatient};

        // Processing patients
        System.out.println("Hospital Patient Management System:");
        for (int i = 0; i < patients.length; i++) {
            patients[i].getPatientDetails();
            System.out.println("Total Bill: " + patients[i].calculateBill());

            if (patients[i] instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patients[i];
                medicalRecord.viewRecords();
            }
        }
    }
}
