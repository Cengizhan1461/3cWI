package at.cengo.projects.ObjektOrientierung;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsepower = horsePower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("the motor is running with" + amount);
    }

    public int getHorsepower(){
        return horsepower;
    }

    public TYPE type(){
        return type;
    }

}
