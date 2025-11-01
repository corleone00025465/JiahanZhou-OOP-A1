// HealthProfessional.java
/**
 * Part 1: Base Class - HealthProfessional.java
 * Contains general information for all medical professionals.
 * Variables are protected for encapsulation and inheritance.
 */
public class HealthProfessional {

    // Instance Variables (protected)
    protected int ID;
    protected String name;
    protected String contactNumber;
    protected double baseSalary;

    /**
     * Default Constructor
     */
    public HealthProfessional() {
        this.ID = 0;
        this.name = "Unknown";
        this.contactNumber = "N/A";
        this.baseSalary = 0.0;
    }

    /**
     * Full-parameter Constructor
     */
    public HealthProfessional(int ID, String name, String contactNumber, double baseSalary) {
        this.ID = ID;
        this.name = name;
        this.contactNumber = contactNumber;
        this.baseSalary = baseSalary;
    }

    /**
     * Prints all instance variables.
     */
    public void printDetails() {
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.name);
        System.out.println("Contact Number: " + this.contactNumber);
        // Format salary output
        System.out.println("Base Salary: $" + String.format("%.2f", this.baseSalary));
    }

    // --- Getters and Setters (Encapsulation) ---

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}