import java.util.ArrayList;

public class Student {
    public String name;
    public long matrikel;
    public Computer computer;
    public ArrayList<Vorlesung> vorlesungen = new ArrayList<Vorlesung>();

    //constructor
    public Student(String name, long matrikel){
        this.name = name;
        this.matrikel = matrikel;
    }

    public void vorlesungHinzufuegen(Vorlesung vorlesung){
        vorlesungen.add(vorlesung);
        vorlesung.studenten.add(this);  //gegenseitig
    }

    public void vorlesungEntfernen(Vorlesung vorlesung){
        this.vorlesungen.remove(vorlesung);
        vorlesung.studentEntfernen(this);
    }

    public Vorlesung vorlesungEntfernenNachName(String kursName){
        for (int i = 0; i < vorlesungen.size(); i++){
            Vorlesung kursEntfernt = vorlesungen.get(i);
            if (kursEntfernt.bezichnung == kursName){
                vorlesungen.remove(kursEntfernt);
            }
            return kursEntfernt;
        }
        return null;
    }

}
