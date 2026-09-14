package part1Inheritance;

public class InheritanceDriver {
    public static void main(String[] args) {
        // Populate all employees
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        // Print each employee values
        System.out.println("Joe Jones");
        System.out.println("SSN: " + joe.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + joe.getWeeklySalary());
        System.out.println();

        System.out.println("Stephanie Smith");
        System.out.println("SSN: " + stephanie.getSocialSecurityNumber());
        System.out.println("Wage: $" + stephanie.getWage());
        System.out.println("Hours Worked: " + stephanie.getHours());
        System.out.println();

        System.out.println("Mary Quinn");
        System.out.println("SSN: " + mary.getSocialSecurityNumber());
        System.out.println("Wage: $" + mary.getWage());
        System.out.println("Hours Worked: " + mary.getHours());
        System.out.println();

        System.out.println("Nicole Dior");
        System.out.println("SSN: " + nicole.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + nicole.getCommissionRate() + "%");
        System.out.println("Gross Sales: $" + nicole.getGrossSales());
        System.out.println();

        System.out.println("Renwa Chanel");
        System.out.println("SSN: " + renwa.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + renwa.getWeeklySalary());
        System.out.println();

        System.out.println("Mike Davenport");
        System.out.println("SSN: " + mike.getSocialSecurityNumber());
        System.out.println("Base Salary: $" + mike.getBaseSalary());
        System.out.println();

        System.out.println("Mahnaz Vaziri");
        System.out.println("SSN: " + mahnaz.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + mahnaz.getCommissionRate() + "%");
        System.out.println("Gross Sales: $" + mahnaz.getGrossSales());
    }
}
