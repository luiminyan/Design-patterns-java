public class ShapeDecoratorTest {
    public static void main(String[] args){
        //create shape
        Shape circle01 = new Circle();
        Shape rectangle01 = new Rectangle();

        //create decorator
        ShapeDecorator redCircle01 = new RedBorderShapeDecorator(circle01);
        ShapeDecorator redCircle02 =  new RedBorderShapeDecorator(new Circle());
        ShapeDecorator rectangle02 = new RedBorderShapeDecorator(new Rectangle());

        redCircle01.draw();
        redCircle02.draw();
        rectangle01.draw();
        rectangle02.draw();
    }
}
