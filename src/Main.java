public class Main {
    public static void main(String[] args) {
        // Instantiates vehicle obj
        System.out.println("Testing Vehicle Class:");
        Vehicle myVehicle = new Vehicle(2, "Red", 0.5f, "Gasoline");

        // Testing getters
        System.out.println("Vehicle Color: " + myVehicle.getColor());
        System.out.println("Vehicle Engine: " + myVehicle.getEngineSize());

        // Testings setters
        myVehicle.setColor("Blue");
        System.out.println("New Vehicle Color: " + myVehicle.getColor());

        System.out.println(); // Print a blank line

        // Instantiates car obj
        System.out.println("Testing Car Class:");
        Car myCar = new Car(6, "Chrome", 2.5f, "Diesel", "Ferrari");

        // Testing honk method
        myCar.honk();

        // Testing displayInfo
        myCar.displayInfo();
    }
}