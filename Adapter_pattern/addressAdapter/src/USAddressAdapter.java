public class USAddressAdapter extends USAddress implements AdressValidator{
    //implements istGueltig() from interface AdressValidator
    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        return false;
    }
}
