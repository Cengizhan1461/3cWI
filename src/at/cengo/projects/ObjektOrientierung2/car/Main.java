package at.cengo.projects.ObjektOrientierung2.car;

public class Main  {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("BMW","Germany",5);
        Engine engine = new Engine(100, Engine.TYPE.BENZIN);
        Car car = new Car(engine, "green", 10, 10000,4,m1);
        System.out.println(car.getEngine().getKraftstoff());
    }
}