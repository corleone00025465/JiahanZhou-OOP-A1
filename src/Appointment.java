// Appointment.java
/**
 * Part 4: Appointment Class - Appointment.java
 * Demonstrates Aggregation and Polymorphism.
 */
public class Appointment {

    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;

    // Polymorphism Key: doctor of base class type HealthProfessional
    private HealthProfessional doctor;

    /**
     * Default Constructor
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "N/A";
        this.preferredTimeSlot = "N/A";
        this.doctor = null;
    }

    /**
     * Full-parameter Constructor
     */
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    /**
     * Prints appointment details.
     */
    public void printAppointmentDetails() {
        System.out.println("\n=== Appointment Details ===");
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Patient Mobile: " + this.mobilePhone);
        System.out.println("Preferred Time: " + this.preferredTimeSlot);
        System.out.println("--- Assigned Doctor ---");

        if (this.doctor != null) {
            // Polymorphism Key: Invokes the overridden printDetails() method
            this.doctor.printDetails();
        } else {
            System.out.println("No doctor assigned.");
        }
        System.out.println("===========================");
    }

    /**
     * Extra method: Used for the cancelBooking function in Part 5.
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    // --- Getters/Setters ---
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setMobilePhone(String mobilePhone) { this.mobilePhone = mobilePhone; }
    public String getPreferredTimeSlot() { return preferredTimeSlot; }
    public void setPreferredTimeSlot(String preferredTimeSlot) { this.preferredTimeSlot = preferredTimeSlot; }
    public HealthProfessional getDoctor() { return doctor; }
    public void setDoctor(HealthProfessional doctor) { this.doctor = doctor; }
}