import java.util.ArrayList;

public class Labyrinth {
    private int n;
    private int m;
    private Zelle Startpunkt;
    private Zelle Endpunkt;

    private ArrayList<Wand> Waende;
    private ArrayList<Vorhang> Vorhaenge;

    private Zelle[][] zellenListe;

    public Labyrinth(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public Labyrinth(int n, int m, Zelle startpunkt, Zelle endpunkt) {
        this.n = n;
        this.m = m;
        this.zellenListe = new Zelle[n][m];
        Startpunkt = startpunkt;
        Endpunkt = endpunkt;
        zellenListe[startpunkt.getX()][startpunkt.getY()] = startpunkt;
        zellenListe[endpunkt.getX()][endpunkt.getY()] = endpunkt;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public Zelle getStartpunkt() {
        return Startpunkt;
    }

    public Zelle getEndpunkt() {
        return Endpunkt;
    }

    public ArrayList<Wand> getWaende() {
        return Waende;
    }

    public ArrayList<Vorhang> getVorhaenge() {
        return Vorhaenge;
    }

    public void setWaende(ArrayList<Wand> waende) {
        Waende = waende;
    }

    public void setVorhaenge(ArrayList<Vorhang> vorhaenge) {
        Vorhaenge = vorhaenge;
    }
}
