package at.cengo.projects.ObjektOrientierung2;


//Ein Auto hat eine Farbe, eine Maximalgeschwindigkeit, einen Basispreis,
//Basisverbrauch und einen Hersteller und einen Motor.
//Der Hersteller hat einen Namen und ein Herkunftsland.
//Jeder Hersteller gibt einen gewissen Rabatt. Dieser ist unterschiedlich je nach Hersteller.
//Der Rabatt wird in Prozent angegeben.
//Der Motor ist entweder Diesel oder Benzin und hat eine Leistung.
//Der Preis berechnet sich durch den Abzug des Rabatts vom Basispreis.
//Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch.
// Danach wird er um 9.8 Prozent höher.


import java.util.List;

public class Car {
    private String colour;
    private int speed;
    private int cost;
    private int fuelConsumption;
    private Manufacturer manufacturer;
    private Engine engine;
    private List<LightElement> lightElements;
    private List<Lamp> lamps;


    public Car(Engine engine, String colour, int speed, int cost, int fuelConsumption, Manufacturer manufacturer) {
        this.engine = engine;
        this.colour = colour;
        this.speed = speed;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCost() {
        return cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    // Setter methods
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Calculate the price after applying the discount
    public int calculatePrice() {
        int discount = manufacturer.getDiscount();
        return cost - (cost * discount / 100);
    }


    // Calculate fuel consumption based on kilometers driven
    public double calculateFuelConsumption(int kilometersDriven) {
        if (kilometersDriven <= 50000) {
            return fuelConsumption;
        } else {
            return fuelConsumption * 1.098; // Increase by 9.8%
        }
    }


}









