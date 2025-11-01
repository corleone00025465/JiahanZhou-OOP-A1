// AssignmentOne.java
import java.util.ArrayList;

/**
 * Part 5: Main Run Class - AssignmentOne.java
 * Demonstrates collections and business logic.
 */
public class AssignmentOne {

    // --- Part 5A: Static Methods ---

    /**
     * Creates and adds a new appointment to the list.
     */
    public static void createAppointment(ArrayList<Appointment> bookings, String name, String mobile, String time, HealthProfessional doctor) {

        // High Score: Input Validation
        if (name == null || name.trim().isEmpty() ||
                mobile == null || mobile.trim().isEmpty() ||
                time == null || time.trim().isEmpty() ||
                doctor == null) {

            System.out.println("[Error] Cannot create appointment. All fields (name, mobile, time, doctor) are required. Appointment not created.\n");
            return;
        }

        Appointment newBooking = new Appointment(name, mobile, time, doctor);
        bookings.add(newBooking);
        System.out.println("[Success] Appointment for " + name + " created successfully.\n");
    }

    /**
     * Prints all existing appointments.
     */
    public static void printExistingAppointments(ArrayList<Appointment> bookings) {
        System.out.println("\n--- Printing All Existing Appointments ---");

        // High Score: Empty list check
        if (bookings == null || bookings.isEmpty()) {
            System.out.println("No appointments currently exist.");
            System.out.println("----------------------------------------");
            return;
        }

        for (Appointment appt : bookings) {
            appt.printAppointmentDetails();
        }
        // Output changed to English
        System.out.println("\n--- Appointment List Printed ---");
    }

    /**
     * Cancels an appointment by mobile number.
     */
    public static void cancelBooking(ArrayList<Appointment> bookings, String mobile) {
        boolean found = false;

        if (bookings == null || mobile == null || mobile.trim().isEmpty()) {
            System.out.println("[Error] Cannot cancel booking. List or mobile number is invalid.");
            return;
        }

        // High Score: Safe removal (iterating backwards)
        for (int i = bookings.size() - 1; i >= 0; i--) {
            if (bookings.get(i).getMobilePhone().equals(mobile)) {
                Appointment removedAppt = bookings.remove(i);
                // Output changed to English
                System.out.println("[Success] Booking cancelled for " + removedAppt.getPatientName() + " (Mobile: " + mobile + ").\n");
                found = true;
                break;
            }
        }

        // High Score: Error handling for unfound number
        if (!found) {
            // Output changed to English
            System.out.println("[Error] Mobile phone " + mobile + " not found in existing appointments. Cancellation failed.\n");
        }
    }


    // --- Part 5B: main Method Demonstration ---

    public static void main(String[] args) {

        // Part 3 Demonstration
        System.out.println("// Part 3 Using classes and objects\n");

        // Create 3 General Practitioners and 2 Radiologists
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice Smith", "0411222333", 120000, 30);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob Brown", "0422333444", 130000, 25);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Carol White", "0433444555", 125000, 40);
        Radiologist rad1 = new Radiologist(201, "Dr. David X-Ray", "0444555666", 250000, "MRI");
        Radiologist rad2 = new Radiologist(202, "Dr. Eve Stone", "0455666777", 275000, "CT Scan");

        // Print details
        gp1.printDetails(); System.out.println();
        gp2.printDetails(); System.out.println();
        gp3.printDetails(); System.out.println();
        rad1.printDetails(); System.out.println();
        rad2.printDetails();

        // Print separator
        System.out.println("\n-----\n// Part 5 Collection of appointments\n");

        // Part 5 Demonstration: Declare ArrayList<Appointment> collection
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Booking 1 & 2: Pass GeneralPractitioner object (Polymorphism)
        createAppointment(appointmentList, "John Patient", "0400111000", "Mon 10:00 AM", gp1);
        createAppointment(appointmentList, "Jane Patient", "0400222111", "Mon 11:00 AM", gp2);

        // Booking 3 & 4: Pass Radiologist object (Polymorphism)
        createAppointment(appointmentList, "Adam Sample", "0400333222", "Tue 9:00 AM", rad1);
        createAppointment(appointmentList, "Mary Test", "0400444333", "Tue 9:30 AM", rad2);

        // High Score Demo: Test validation logic
        System.out.println("--- Testing Invalid Input (Expected Error) ---");
        createAppointment(appointmentList, "Invalid User", " ", "Wed 1:00 PM", gp3);
        System.out.println("--- Validation Test Complete ---\n");

        // First Print
        printExistingAppointments(appointmentList);

        // Cancel Booking: Cancel an existing one
        System.out.println("\n--- Attempting to Cancel Booking (Mobile: 0400333222) ---");
        cancelBooking(appointmentList, "0400333222");

        // High Score Demo: Test cancellation of a non-existing booking
        System.out.println("--- Attempting to Cancel Non-Existing Booking (Expected Error) ---");
        cancelBooking(appointmentList, "9999999999");

        // Second Print: Show updated list
        System.out.println("\n--- Printing Appointment List After Cancellation ---");
        printExistingAppointments(appointmentList);

        // Print final separator
        System.out.println("------");
    }
}