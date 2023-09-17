public class WaehrungenAdapter implements Waehrung {
//    adaptee
    private ICurrency iCurrency;
//    construtor with adaptee as parameter
    public WaehrungenAdapter(ICurrency iCurrency){
        this.iCurrency = iCurrency;
    }
//    methods from target interface
    @Override
    public String getTyp(){
        return iCurrency.getName();
    }
    public double getWert(){
        return iCurrency.getValue();
    }
    public double getWertInEUR(){
        return ConverterFunctions.USDtoEUR(iCurrency.getValueInUSD());
    }
}
