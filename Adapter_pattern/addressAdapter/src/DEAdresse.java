public class DEAdresse implements AdressValidator{
    //implements istGueltig from AdressValidator interface
    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        return false;
    }
}
