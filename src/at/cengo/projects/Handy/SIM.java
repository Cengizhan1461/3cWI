package at.cengo.projects.Handy;

public class SIM {
    private int ID;
    private String number;

    public SIM(int ID, String number) {
        this.ID = ID;
        this.number = number;
    }

    public void doCall(String number) {
        System.out.println("calling... " + number);

    }
}
