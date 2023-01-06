import java.util.Scanner;


public class MethodsExercises {

    public static Scanner scanner = new Scanner(System.in);

    public static long randomNumber(int max) {
        return Math.round(Math.random() * max);
    }

    public static void main(String[] args) {
        System.out.println(add(3, 2));
        System.out.println(sub(3, 2));
        System.out.println(multi(3, 2));
        System.out.println(divide(3, 2));
        System.out.println(modded(3, 2));
        getInteger(1, 10);
        factorial();
        rollDice();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modded(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10:");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("You have entered a number outside the range. Try again.");
        return getInteger(min, max);
    }

    public static void factorial() {
        Boolean moveAHead;
        do {
            int UserNumber = getInteger(1, 10);
            long factorial = 1;
            for (int i = 1; i < UserNumber; i++) {
                factorial *= i + 1;
            }
            System.out.println(UserNumber + "! = " + factorial);
            System.out.println("Would You like to continue?[true/false]");
            moveAHead = scanner.nextBoolean();
        } while (moveAHead);
    }

    public static void rollDice() {
        Boolean moveAHead;
        do {
            System.out.println("How many side to your dice, traveler?");
            int numberOfSide = scanner.nextInt();
            System.out.println("ROLLING the Dice...");
            long die1 = randomNumber(numberOfSide);
            long die2 = randomNumber(numberOfSide);
            System.out.printf("You rolled a %s and a %s%n", die1, die2);
            System.out.println("Would You like to roll again?[true/false]");
            moveAHead = scanner.nextBoolean();
        } while (moveAHead);
    }

}
