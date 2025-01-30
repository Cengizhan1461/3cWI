package at.cengo.projects.ObjektOrientierung2.lamps;

public class LightElement {


        private String name;
        private String color;
        private double powerConsumption;
        private boolean status;

        public LightElement(String name, String color, double powerConsumption) {
            this.name = name;
            this.color = color;
            this.powerConsumption = powerConsumption;
            this.status = false; // Initially, the light is turned off
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getPowerConsumption() {
            return powerConsumption;
        }

        public void setPowerConsumption(double powerConsumption) {
            this.powerConsumption = powerConsumption;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        // Method to turn on the light
        public void turnOn() {
            if (status) {
                System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
            } else {
                status = true;
                powerConsumption += 5; // Power consumption increases by 5 each time the light is turned on
            }
        }
    }
