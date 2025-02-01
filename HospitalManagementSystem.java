package Task2;
import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<Staff> staffList = new ArrayList<>();

    public void registerPatient() {
        System.out.println("Registering Patient...");
        Patient patient = new Patient("John Doe", "Male", 30, "1234567890");
        patients.add(patient);
        System.out.println("Patient Registered: " + patient);
    }

    public void scheduleAppointment() {
        System.out.println("Scheduling Appointment...");
        Appointment appointment = new Appointment("John Doe", "Dr. Smith", "2025-01-15");
        appointments.add(appointment);
        System.out.println("Appointment Scheduled: " + appointment);
    }

    public void viewEHR() {
        System.out.println("Fetching EHR...");
    }

    public void generateBill() {
        System.out.println("Generating Bill...");
    }

    public void manageInventory() {
        System.out.println("Managing Inventory...");
    }

    public void manageStaff() {
        System.out.println("Managing Staff...");
    }
}

