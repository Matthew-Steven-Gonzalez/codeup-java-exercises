package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter A string: ");
        String string = this.scanner.next();
        return string;
    }

    public boolean yesNo(){
        System.out.printf("Yes or No?");
        String resp = this.scanner.next();
        if( resp.equalsIgnoreCase("yes") || resp.equalsIgnoreCase("y")|| resp.equalsIgnoreCase("sure") || resp.equalsIgnoreCase("mmhm")){
            return true;
        }
        return false;
    }

    public int getInteger(int min, int max) {
        System.out.println("Enter a number between min and max:");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("You have entered a number outside the range. Try again.");
        return getInteger(min, max);
    }

    public int getInteger(){
        System.out.println("Enter a number: ");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public double getDouble( double min, double max){
        System.out.println("Enter a number between min and max: ");
        double userInput = scanner.nextDouble();
        if( userInput >= min && userInput <= max){
            return userInput * 2;
        }
        System.out.println("You have entered a number outside the range. Try again.");
        return getDouble(min, max);
    }

    public double getDouble(){
        double userInput = scanner.nextDouble();
        return userInput * 2;
    }
}
