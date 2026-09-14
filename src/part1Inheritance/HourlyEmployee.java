package part1Inheritance;
public class HourlyEmployee extends Employee {
    // Instantiate vars
    private double wage;
    private double hours;

    // Constructor
    public HourlyEmployee(String firstName, String lastName, 
        String socialSecurityNumber, double wage, double hours) {
            super(firstName, lastName, socialSecurityNumber);
            this.wage = wage;
            this.hours = hours;
    }

    // Getters
    public double getWage() {
        return wage;
    }
    public double getHours() {
        return hours;
    }

    // Setters
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}