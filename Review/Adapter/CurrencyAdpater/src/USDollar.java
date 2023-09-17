public class USDollar implements ICurrency{
    private double value;
    public USDollar(double value){
        this.value = value;
    }
    @Override
    public String getName(){
        return "USD";
    }
    @Override
    public double getValue(){
        return value;
    }
    @Override
    public double getValueInUSD(){
        return value;
    }

}
