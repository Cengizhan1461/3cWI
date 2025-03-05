package at.cengo.projects.Handy;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM(1, "+43 676 543 2109");
        SdCard card = new SdCard(5000);
        Camera camera = new Camera();

        Phone phone = new Phone(sim, camera, card);
        phone.doCall("+43 660 123 4567");

        phone.takePicture();
        phone.takePicture();
        phone.takePicture();
        phone.printAllFiles();
    }
}
