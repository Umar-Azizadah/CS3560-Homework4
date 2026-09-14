package part3Polymorphism;

public class CruiseShip extends Ship {
    // Instance vars
    private int maxNumPassengers;

    // Constructor
    public CruiseShip(String name, String yearShipBuilt, int maxNumPassengers) {
        super(name, yearShipBuilt);
        this.maxNumPassengers = maxNumPassengers;
    }

    // Getter
    public int getMaxNumPassengers() {
        return maxNumPassengers;
    }

    // Setter
    public void setMaxNumPassengers(int maxNumPassengers) {
        this.maxNumPassengers = maxNumPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship: " + getName() + " Max number of passengers: " + getMaxNumPassengers());

    }
}
