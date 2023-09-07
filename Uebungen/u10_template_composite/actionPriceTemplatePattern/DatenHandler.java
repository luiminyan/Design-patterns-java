import java.io.File;

public abstract class DatenHandler {
    protected File datei;

    // constructor
    public DatenHandler(File datei) {
        this.datei = datei;
    }

    public Aktienkurs einlesen() {
        if (!validiereDateipfad()) {
            System.out.println("Datei" + datei + " ist nicht lesbar.");
            return null;
        }
        else if (!validiereDatentyp()) {
            System.out.println("Datei" + datei + " hat nicht das korrekte Format.");
            return null;
        }
        Aktienkurs aktien = transformiereDaten();
        return aktien;
    }

    public boolean validiereDateipfad(){
        return datei.canRead();
    }

    // ob korrekter Datentyp
    protected abstract boolean validiereDatentyp();
    protected abstract Aktienkurs transformiereDaten();
}
