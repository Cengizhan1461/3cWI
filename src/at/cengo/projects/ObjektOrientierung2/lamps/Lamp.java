package at.cengo.projects.ObjektOrientierung2.lamps;

import at.cengo.projects.ObjektOrientierung.LightElement;

import java.util.ArrayList;
import java.util.List;

public class Lamp {

    private List<LightElement> lightElements;

    // Konstruktor
    public Lamp() {

        this.lightElements = new ArrayList<>();
    }

    // Methode, um ein Glühelement hinzuzufügen
    public void addLightElement(LightElement lightElement) {
        lightElements.add(lightElement);
    }

    // Methode, um alle Glühelemente einzuschalten
    public void turnAllOn() {
        for (LightElement element : lightElements) {
            element.turnOn();
        }
    }

    // Methode, um den gesamten Stromverbrauch zurückzugeben
    public double getOverallPowerUsage() {
        double totalPower = 0;
        for (LightElement element : lightElements) {
            totalPower += element.getPowerConsumption();
        }
        return totalPower;
    }

    // Methode, um die Namen aller Glühelemente zu drucken
    public void printNamesOfLightElements() {
        for (LightElement element : lightElements) {
            System.out.println(element.getName());
        }
    }
}
