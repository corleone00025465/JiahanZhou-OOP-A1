// GeneralPractitioner.java
/**
 * Part 2: Subclass - GeneralPractitioner.java
 * Extends HealthProfessional, demonstrating Inheritance.
 */
public class GeneralPractitioner extends HealthProfessional {

    // Unique private variable
    private int patientLimitPerDay;

    /**
     * Default Constructor
     */
    public GeneralPractitioner() {
        super();
        this.patientLimitPerDay = 0;
    }

    /**
     * Full-parameter Constructor - Calls super()
     */
    public GeneralPractitioner(int ID, String name, String contactNumber, double baseSalary, int patientLimitPerDay) {
        super(ID, name, contactNumber, baseSalary);
        this.patientLimitPerDay = patientLimitPerDay;
    }

    /**
     * Overrides printDetails() method, demonstrating Polymorphism.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Professional Type: General Practitioner ---");
        super.printDetails();
        System.out.println("Patient Limit per Day: " + this.patientLimitPerDay);
    }

    public int getPatientLimitPerDay() { return patientLimitPerDay; }
    public void setPatientLimitPerDay(int patientLimitPerDay) { this.patientLimitPerDay = patientLimitPerDay; }
}