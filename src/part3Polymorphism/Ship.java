package part3Polymorphism;

public class Ship {
    // Instance vars
    private String name;
    private String yearShipBuilt;

    // Constructor
    public Ship(String name, String yearShipBuilt) {
        this.name = name;
        this.yearShipBuilt = yearShipBuilt;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getYearShipBuilt() {
        return yearShipBuilt;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearShipBuilt(String yearShipBuilt) {
        this.yearShipBuilt = yearShipBuilt;
    }

    public void print() {
        System.out.println("Ship: " + getName() + " Year: " + getYearShipBuilt());
    }

}
