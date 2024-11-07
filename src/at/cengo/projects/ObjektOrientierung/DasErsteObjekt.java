package at.cengo.projects.ObjektOrientierung;

public class DasErsteObjekt {
    public static void main(String[] args) {
        int a = 7;

        car c1 = new car();
        c1.brand = "Audi";
        c1.fuelConsuption= 5;
        c1.serialNumber= "A1234";
        c1.colour= "Black";


        car c2 = new car();
        c1.brand = "BMW";
        c1.fuelConsuption= 4;
        c1.serialNumber= "B1238";
        c1.colour= "Black";

        System.out.println(c1.fuelConsuption);



    }
}
