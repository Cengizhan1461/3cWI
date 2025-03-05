package at.cengo.projects.Handy;

import java.util.ArrayList;
import java.util.List;


public class SdCard {


    private int capacity;
    private List<PhoneFile> files;
    private SdCard card;

    public SdCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save(PhoneFile file) {
        files.add(file);

    }

    public List<PhoneFile> getFiles() {
        return files;
    }
}
