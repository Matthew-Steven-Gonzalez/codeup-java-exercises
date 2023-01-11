package shapes;

public class Square extends Rectangle {

    public Square( double side){
        super(side, side);
    }

    public double getArea(){
        return (int) Math.pow(this.length,2);
    }

    public double getPerimeter(){
        return this.width * 4;
    }
}
