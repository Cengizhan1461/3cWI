package at.cengo.projects.ObjektOrientierung2.Vererbung_Override;


public class Car {
    private String brand;
    private String colour;
    private Engine engine;


    public Car(Engine engine, String colour, String brand) {
        this.engine = engine;
        this.colour = colour;
        this.brand = brand;
    }



    public void drive(){
        System.out.println("I am driving");
    }

    public void stop(){
        System.out.println("I am breaking the car");
    }


    public String getBrand(){return brand;}
    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getColour() {
        return colour;
    }

    // Setter methods
    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    }











