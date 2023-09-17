public class CADollar implements ICurrency{
    private double value;
    public CADollar(double value){
        this.value = value;
    }
    @Override
    public String getName(){
        return "CAD";
    }
    public double getValue(){
        return value;
    }
    public double getValueInUSD(){
        return ConverterFunctions.CADtoUSD(value);
    }
}
