public abstract class ShapeDecorator implements Shape{
    //abstract class does not need to implement the function from the interface
    protected Shape decoratedShape;     //to store the decorated shape

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

}
