package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return (2 * length) + ( 2 * width);
    }

    public int getPerimeter(){
        return length * width;
    }

}
