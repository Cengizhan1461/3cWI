package at.cengo.projects.ObjektOrientierung2.lamps;

import at.cengo.projects.ObjektOrientierung.LightElement;

public class Main {
    public static void main(String[] args) {


        LightElement l1 = new LightElement("LED", "White", 8);
        LightElement l2 = new LightElement("Stehlampe","green",5);

        Lamp lamp = new Lamp();
        lamp.addLightElement(l1);
        lamp.addLightElement(l2);

        lamp.printNamesOfLightElements();
        System.out.println(lamp.getOverallPowerUsage());

    }
}
