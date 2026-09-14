package part1Inheritance;

public class SalariedEmployee extends Employee {
    // Instantiate var
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String firstName, String lastName,
            String socialSecurityNumber, double weeklySalary) {

        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Getter
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Setter
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}