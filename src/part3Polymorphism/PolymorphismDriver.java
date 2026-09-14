package part3Polymorphism;

public class PolymorphismDriver {
    public static void main(String[] args) {
        // Creat ship array
        Ship[] ships = new Ship[3];

        // Populate array with different ship types
        ships[0] = new Ship("Veil", "2075");
        ships[1] = new CruiseShip("Titanic", "1950", 3000);
        ships[2] = new CargoShip("Aziz", "2026", 200);

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
