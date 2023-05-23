public class Betriebssystem {
    //attributes
    private Strategie strategie;

    //constructor
    public Betriebssystem(Strategie strategie){
        this.strategie = strategie;
    }

    @Override
    public String toString() {
        return strategie.getOS();   //overwrite toString
    }

    //getters and setters
    public Strategie getStrategie() {
        return strategie;
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }
}
