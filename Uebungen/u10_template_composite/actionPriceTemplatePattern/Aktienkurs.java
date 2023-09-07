import java.util.ArrayList;

public class Aktienkurs {
    // to store the tageskursen
    public ArrayList<Tageskurs> tageskurse = new ArrayList<Tageskurs>();

    // constructor
    public Aktienkurs() {
    }

    // getter and setter
    public ArrayList<Tageskurs> getTageskurs() {
        return tageskurse;
    }

    public void setTageskurs(ArrayList<Tageskurs> tageskurse) {
        this.tageskurse = tageskurse;
    }


}