package encapsulationandpolymorphism.hospitalmanagementsystem;

// InPatient Class
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private String[] medicalRecords;
    private int recordCount;

    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new String[10]; // Limit to 10 records for simplicity
        this.recordCount = 0;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted; // Billing logic for inpatients
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < medicalRecords.length) {
            medicalRecords[recordCount++] = record;
        } else {
            System.out.println("Medical record limit reached.");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (int i = 0; i < recordCount; i++) {
            System.out.println((i + 1) + ". " + medicalRecords[i]);
        }
    }
}
