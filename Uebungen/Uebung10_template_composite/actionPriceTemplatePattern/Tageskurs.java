import java.util.Date;

public class Tageskurs {
    public Date datum;
    public double eroeffnungswert;
    public double maximalwert;
    public double minimalwert;
    public double schlusswert;

    // constructor
    public Tageskurs(Date datum, double eroeffnungswert, double maximalwert, double minimalwert, double schlusswert) {
        this.datum = datum;
        this.eroeffnungswert = eroeffnungswert;
        this.maximalwert = maximalwert;
        this.minimalwert = minimalwert;
        this.schlusswert = schlusswert;
    }

    public Date getDatum() {
        return datum;
    }

    public double getEroeffnungswert() {
        return eroeffnungswert;
    }

    public double getMaximalwert() {
        return maximalwert;
    }

    public double getMinimalwert() {
        return minimalwert;
    }

    public double getSchlusswert() {
        return schlusswert;
    }

    
}
