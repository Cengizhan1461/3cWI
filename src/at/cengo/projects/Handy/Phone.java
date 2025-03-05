package at.cengo.projects.Handy;

import java.util.List;

public class Phone {

    private SIM sim;
    private Camera camera;
    private SdCard card;

    public Phone(SIM sim, Camera camera, SdCard card) {
        this.sim = sim;
        this.camera = camera;
        this.card = card;
    }

    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public void takePicture() {
        PhoneFile file = this.camera.takePicture();
        this.card.save(file);
    }

    public void printAllFiles() {
        List<PhoneFile> files = this.card.getFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
        }
    }
}
