package de.rub;

public class Veranstaltung {
    private String name = "Neue Vorlesung";
    private String wochentag = "Montag";
    private String uhrzeit = "8:00";
    private int dauer = 120;
    private String raum;
    private TYP typ = TYP.VORLESUNG;
    private String notizen;


    public enum TYP {
        UEBUNG, VORLESUNG
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWochentag() {
        return wochentag;
    }

    public void setWochentag(String wochentag) {
        this.wochentag = wochentag;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public TYP getTyp() {
        return typ;
    }

    public void setTyp(TYP typ) {
        this.typ = typ;
    }

    public String getNotizen() {
        return notizen;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

    @Override
    public String toString() {
        return name;
    }
}
