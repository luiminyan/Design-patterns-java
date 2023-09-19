public class CurrencyAdapter implements Waehrung{
    private ICurrency currency;

//    constructor of adapter classs, use Class A object as parameter
    public CurrencyAdapter(ICurrency currency){
        this.currency = currency;
    }
    @Override
    public String getTyp() {
        return currency.getName();
    }

    @Override
    public double getWert() {
        return currency.getValue();
    }

    @Override
    public double getWertInEUR() {
//        transfer the (northean american) currencies firstly into USD, then from USD into Euro
        return ConverterFunctions.USDtoEUR(currency.getValueInUSD());
    }
}
