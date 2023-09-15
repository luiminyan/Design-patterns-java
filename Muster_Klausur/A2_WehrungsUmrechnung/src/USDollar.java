public class USDollar implements ICurrency{
//    value in US-Dollar
    private double value;
    @Override
    public String getName() {
        return "US-Dollar";
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getValueInUSD() {
        return value;
    }
}
