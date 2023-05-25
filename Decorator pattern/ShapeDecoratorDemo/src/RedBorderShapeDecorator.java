public class RedBorderShapeDecorator extends ShapeDecorator{
    //constructor
    public RedBorderShapeDecorator(Shape s){
        super(s);
    }

    @Override
    public void draw() {
        //call decoratedShape from the abstract class
        super.decoratedShape.draw();
        System.out.println("Border Color: Red\n");
    }

    //extra function
    public void redBorderShape(){
        System.out.println("Border Color: Red");
    }
}
