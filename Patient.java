package Task2;

public class Patient {
    private String name;
    private String gender;
    private int age;
    private String contact;

    public Patient(String name, String gender, int age, String contact) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient [Name=" + name + ", Gender=" + gender + ", Age=" + age + ", Contact=" + contact + "]";
    }
}
