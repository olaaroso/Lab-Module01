public class Car extends Vehicle {
    private String brand;

    // Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        // Call the parent (Vehicle) constructor first
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method implements honk
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Method displays all info
    public void displayInfo() {
        System.out.println("--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + getColor());
        System.out.println("Wheels: " + getNumberOfWheels());
        System.out.println("Engine Size: " + getEngineSize() + "L");
        System.out.println("Fuel Type: " + getFuelType());
    }
}