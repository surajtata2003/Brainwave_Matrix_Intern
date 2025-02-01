package Task2;

public class Appointment {
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(String patientName, String doctorName, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment [Patient=" + patientName + ", Doctor=" + doctorName + ", Date=" + date + "]";
    }
}
