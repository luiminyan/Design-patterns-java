public class ConverterFunctions {
    public static double USDtoEURRate = 0.94;
    public static double EURtoUSDRate = 1.07;
    public static double CADtoUSDRate = 0.74;

//    静态方法：static / 类方法，不需要创建对象， 可以直接访问， 在UML上是带下划线的函数方法
    public static double USDtoEUR(double usd){
        return usd * USDtoEURRate;
    }
    public static double EURtoUSD(double eur){
        return eur * EURtoUSDRate;
    }
    public static double CADtoUSD(double cad){
        return cad * CADtoUSDRate;
    }
}
