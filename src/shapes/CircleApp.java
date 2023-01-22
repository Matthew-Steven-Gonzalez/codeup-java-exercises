package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        boolean moveAHead;

        int circleCount = 0;

        do {
            System.out.println("Let's make a Circle. Enter the new circles radius: ");
            Input input = new Input();
            Circle newCircle;
            circleCount++;
            newCircle = new Circle(input.getDouble());
            System.out.printf("Your new circle is created!%nThe Area of your new circle is: %.0f\nThe Circumference of your circle is: %.0f\n", newCircle.getArea(), newCircle.getCircumference());
            System.out.println("Would you like to keep going?");
            moveAHead = input.yesNo();

        } while (moveAHead);

        if (circleCount >= 3) {
            System.out.printf("You have made %d Circles.%nNice Collection.%nI mean that guy over there made %d,but it's not a contest.", circleCount, circleCount + 1);
        } else {
            System.out.printf("You have made %d Circles, got to get those numbers up. ", circleCount);
        }
    }
}

