package at.cengo.projects.ObjektOrientierung;

public class car {
    // Instanz / Gedächtnis

    public int fuelAmount;
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public String colour;
    public String brake;
    public int tankVolume;

    public car(int fuelConsumption, String brand, String serialNumber){
                this.fuelConsumption = fuelConsumption;
                this.brand = brand;
                this.serialNumber = serialNumber;
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
            System.out.println("Tuuut");
        }
    }
    public void getRemainingRange() {
        System.out.println(fuelAmount / fuelConsumption);
    }
}
