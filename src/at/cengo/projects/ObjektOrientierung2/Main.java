package at.cengo.projects.ObjektOrientierung2;

import at.cengo.projects.ObjektOrientierung.Engine;
import at.cengo.projects.ObjektOrientierung.LightElement;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(450, Engine.TYPE.BENZIN);
        Manufacturer m1 = new Manufacturer("BMW", "Deutschland", 10);
        LightElement l1 = new LightElement("LED", "White", 8);

        Car c1 = new Car(e1,"black", 360, 50000, 5);
        System.out.println(m1.getName());
    }
}
