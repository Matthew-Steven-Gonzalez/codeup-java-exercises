package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle( 5, 4);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//

        Measurable myShape;
        Measurable myShape1;
        myShape1 = new Square(10);
        myShape = new Rectangle(12, 25);
        System.out.println("(myShape.getPerimeter()) = " + (myShape.getPerimeter()));
        System.out.println("(myShape.getArea()) = " + (myShape.getArea()));
        System.out.println("(myShape1.getPerimeter()) = " + (myShape1.getPerimeter()));
        System.out.println("(myShape1.getArea()) = " + (myShape1.getArea()));

    }
}
