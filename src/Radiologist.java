// Radiologist.java
/**
 * Part 2: Subclass - Radiologist.java
 * Extends HealthProfessional.
 */
public class Radiologist extends HealthProfessional {

    // Unique private variable
    private String specialtyImagingArea;

    /**
     * Default Constructor
     */
    public Radiologist() {
        super();
        this.specialtyImagingArea = "Unknown";
    }

    /**
     * Full-parameter Constructor - Calls super()
     */
    public Radiologist(int ID, String name, String contactNumber, double baseSalary, String specialtyImagingArea) {
        super(ID, name, contactNumber, baseSalary);
        this.specialtyImagingArea = specialtyImagingArea;
    }

    /**
     * Overrides printDetails() method, demonstrating Polymorphism.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Professional Type: Radiologist ---");
        super.printDetails();
        System.out.println("Specialty Imaging Area: " + this.specialtyImagingArea);
    }

    public String getSpecialtyImagingArea() { return specialtyImagingArea; }
    public void setSpecialtyImagingArea(String specialtyImagingArea) { this.specialtyImagingArea = specialtyImagingArea; }
}