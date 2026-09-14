package part3Polymorphism;

public class CargoShip extends Ship {
    // instance vars
    private int cargoCapacity;

    // Constructor
    public CargoShip(String name, String yearShipBuilt, int cargoCapacity) {
        super(name, yearShipBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Getters
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Setter
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + getName() + " Cargo Capacity: " + getCargoCapacity());
    }
}
