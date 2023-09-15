public class Ort {
//    atributes
    private String Name;
    private double X;
    private double Y;

//    constructor
    public Ort(String Name, double X, double Y){
        this.Name = Name;
        this.X = X;
        this.Y = Y;
    }

//    getters & setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
