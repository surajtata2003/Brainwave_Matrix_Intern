package Task2;

public class Staff {
    private String name;
    private String role;
    private String contact;

    public Staff(String name, String role, String contact) {
        this.name = name;
        this.role = role;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Staff [Name=" + name + ", Role=" + role + ", Contact=" + contact + "]";
    }
}
