package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean moveAHead = true;

        do{
            System.out.println("Let's make a Circle. Enter the new circles radius: ");
            Circle newCircle;
            newCircle = new Circle(input.getDouble());
            System.out.printf("Your new circle is created!%nThe Area of your new circle is: %s%nThe Circumference of your circle is: %s%n", newCircle.getArea(),newCircle.getCircumference());
            System.out.println("Would you like to keep going?");
            moveAHead = input.yesNo();
        }while(moveAHead);
    }
}
