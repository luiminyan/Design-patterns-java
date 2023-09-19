// Question: implement the IBeitrag interface or the BeitragProxy???
public class Adapter implements IBeitrag{
    private Posting posting;
    public Adapter(Posting posting) {
        this.posting = posting;
    }

    @Override
    public String getNutzername() {
        return posting.getName();
    }

    @Override
    public String getInhalt() {
        return posting.getContent();
    }
}
