public class USAddressAdapter implements AddressValidator{
//    attribute: USAddress
    private USAddress usAddress;
    public USAddressAdapter(USAddress usAddress){
        this.usAddress = usAddress;
    }
    @Override
    public boolean isGueltig(String address, String plz, String bundesland){
        return false;
    }
}
