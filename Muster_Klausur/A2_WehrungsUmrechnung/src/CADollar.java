public class CADollar implements ICurrency{
//    value in CAD-Dollar
    private double value;
    @Override
    public String getName() {
        return "Canadian dollar";
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getValueInUSD() {
        return ConverterFunctions.CADtoUSD(value);
    }
}
