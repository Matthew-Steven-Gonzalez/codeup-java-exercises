package shapes;

public class Circle {


    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
