public class Quader {
    //attributes
    private double l;
    private double b;
    private double h;
    private double d;

    //constructor
    Quader(){}

    Quader(double l, double b, double h, double d){
        this.l = l;
        this.b = b;
        this.h = h;
        this.d = d;
    }

    //3rd. constructor
    Quader(double l){
        this.l = this.b = this.h = l;
        d = 1.0;
    }

    //functions
    double berechneVolumen(){
        double volumen = l * b* h;
        return volumen;
    }

    double berechneOberflaeche(){
        double sum = 2 * (l * b + l * h + b * h);
        return sum;
    }

    double berechneGewicht(){
        double volumen = berechneVolumen();
        double gewicht = d * volumen;
        return gewicht;
    }

    //getters
    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }

    public double getD() { return d; }

    //setters
    public void setL(double l){
        this.l = l;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setD(double d) { this.d = d; }

}
