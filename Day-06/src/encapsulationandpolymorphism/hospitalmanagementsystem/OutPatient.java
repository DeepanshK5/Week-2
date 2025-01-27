package encapsulationandpolymorphism.hospitalmanagementsystem;

// OutPatient Class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String[] medicalRecords;
    private int recordCount;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new String[5]; // Limit to 5 records for simplicity
        this.recordCount = 0;
    }

    @Override
    public double calculateBill() {
        return consultationFee; // Billing logic for outpatients
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
