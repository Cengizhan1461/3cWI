package at.cengo.projects.ObjektOrientierung2.Vererbung_Override;



public class Main  {
    public static void main(String[] args) {

    Engine engine = new Engine(50, Engine.TYPE.DIESEL);

    Car c1 = new Car(engine, "black", "Mercedes");

    Truck t1 = new Truck(engine, "blue", "Volvo", " trailer1");

        System.out.println(t1.getColour() +  t1.getTrailer());
        t1.drive();
        t1.stop();

    }
}