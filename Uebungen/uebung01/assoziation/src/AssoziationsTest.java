public class AssoziationsTest {
    public static void main(String[] args){
        Student s1 = new Student("Peter Petersen", 108089288888L);
        //Computer c1 = new Computer("Dell");
        //s1.computer = c1;
        //System.out.println(s1.name + " benutzt einen " + s1.computer.typ);
        //System.out.println(c1.typ + " ist benutzt von " + s1.name);

        CIPInsel c1 = new CIPInsel("IC 04/630");
        for (int i = 0; i < 10; i++){
            c1.computer[i] = new Computer("Dell OptiPlex 755 MT");
            c1.computer[i].cip = c1;
        }

        s1.computer = c1.computer[0];
        c1.computer[0].benutzter = s1;

        Vorlesung v1 = new Vorlesung("WiSe 22/23", "Theoretische Informatik");
        Vorlesung v2 = new Vorlesung("SoSe 23", "Geometrische Algorithmen");

        s1.vorlesungHinzufuegen(v1);
        s1.vorlesungHinzufuegen(v2);
        v1.studenten.add(s1);

    }
}
