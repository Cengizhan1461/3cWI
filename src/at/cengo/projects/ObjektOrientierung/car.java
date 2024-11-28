package at.cengo.projects.ObjektOrientierung;

public class car {
    // Instanz / Gedächtnis


    private Engine engine;
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String colour;
    private int tankVolume;


    public car(Engine engine, int fuelConsumption, String brand, String serialNumber, String colour, int tankVolume, int fuelAmount){
                this.engine = engine;
                this.fuelConsumption = fuelConsumption;
                this.brand = brand;
                this.serialNumber = serialNumber;
                this.colour = colour;
                this.tankVolume = tankVolume;
                this.fuelAmount = fuelAmount;
    }



    public void turboBoost() {
        if (fuelAmount > 0.1 * tankVolume) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Ich bin ein" + this.brand + "und habe die Farbe" + this.colour + " und habe" + this.engine + "ps");
        }
    }
    public void getRemainingRange() {
        System.out.println(fuelAmount / fuelConsumption);
    }


    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100){
            this.fuelAmount = 100;
        }else{
            this.fuelAmount = fuelAmount;
        }
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void doBrake() {
        System.out.println("I am braking");
    }

    public String getColour() {
        return colour;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}


