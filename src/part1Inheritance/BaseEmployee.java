package part1Inheritance;
public class BaseEmployee extends Employee{
    // Instantiate var
    private double baseSalary;

    // Constructor
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary){
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    // Getter
    public double getBaseSalary() {
        return baseSalary;
    }

    // Setter 
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}