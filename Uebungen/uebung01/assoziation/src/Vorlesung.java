import java.util.*;

public class Vorlesung {
    public String bezichnung;
    public String semester;
    public ArrayList<Student> studenten = new ArrayList<Student>();

    //constructor
    public Vorlesung(String semester, String bezichnung){
        this.bezichnung = bezichnung;
        this.semester = semester;
    }

    public void studentHinzufuegen(Student s){
        studenten.add(s);
        s.vorlesungHinzufuegen(this);

    }

    public void studentEntfernen(Student s){
        studenten.remove(s);
        s.vorlesungEntfernen(this);
    }

    public Student sucheStudent(long matrikel){
        for (int i = 0; i < studenten.size(); i++){
            if (studenten.get(i).matrikel == matrikel){
                return studenten.get(i);
            }
        }
        return null;    //don't forget
    }
}
