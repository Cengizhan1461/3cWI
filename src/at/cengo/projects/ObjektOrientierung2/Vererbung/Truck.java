package at.cengo.projects.ObjektOrientierung2.Vererbung;

public class Truck extends Car{

    private String trailer;

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public Truck(Engine engine, String colour, String brand, String trailer) {
        super(engine, colour, brand);
        this.trailer = trailer;

    }

    @Override
    public void drive() {
        System.out.println("I am driving the truck - consumption as high!");
        super.drive();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
