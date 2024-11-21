package at.cengo.projects.ObjektOrientierung;
import at.cengo.projects.ObjektOrientierung.car;

public class DasErsteObjekt {
    public static void main(String[] args) {
        int a = 7;

        car c1 = new car();
        c1.setBrand("Audi");
        c1.setFuelAmount(50);
        c1.setFuelConsumption(5);
        c1.setSerialNumber("A1234");
        c1.setColour("Black");
        c1.setBrake("Ich Bremse");
        c1.setTankVolume(55);


        System.out.println(c1.getBrake());
        System.out.println(c1.getFuelAmount());
        System.out.println(c1.getColour());
        System.out.println(c1.getSerialNumber());
        System.out.println(c1.getBrand());
        System.out.println(c1.getTankVolume());
        c1.turboBoost();
        c1.honk(4);
        c1.getRemainingRange();

/*
        car c3 = new car(17, "Opel", "1234O");

        System.out.println(c3.serialNumber);
*/


    }
}
