public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;
//    constructor01: Dimensionen(l, b, h) als Parameter
    public Quader(double laenge, double breite, double hoehe){
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
//    Task: 1.6.3
    public void calcVolumen() {
        System.out.println("Das Volumen ist " + this.laenge * this.breite * this.hoehe);
    }





//    Task: 1.6.4
    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }
}
