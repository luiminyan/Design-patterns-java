public class Abonnent implements IAbonnet{
    private String name;
    public Abonnent(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void akualisieren(Zeitung zeitung){
        System.out.println(name + " received " + zeitung.getTitel() + " on " + zeitung.getDatum());
    }
}
