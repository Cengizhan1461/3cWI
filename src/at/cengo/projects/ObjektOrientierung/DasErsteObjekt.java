package at.cengo.projects.ObjektOrientierung;

public class DasErsteObjekt {
    public static void main(String[] args) {
        int a = 7;

        car c1 = new car();
        c1.brand = "Audi";
        c1.fuelAmount= 9;
        c1.fuelConsumption = 5;
        c1.serialNumber= "A1234";
        c1.colour= "Black";
        c1.brake = "Ich Bremse";
        c1.tankVolume = 55;


        System.out.println(c1.brand);
        System.out.println(c1.fuelAmount);
        System.out.println(c1.serialNumber);
        System.out.println(c1.colour);
        System.out.println(c1.brake);
        System.out.println(c1.tankVolume);
        c1.turboBoost();
        c1.honk(1);
        c1.getRemainingRange();




    }
}
