package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String resp = this.scanner.next();
        if( resp.equalsIgnoreCase("yes") || resp.equalsIgnoreCase("y")|| resp.equalsIgnoreCase("sure") || resp.equalsIgnoreCase("mmhm")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between min and max:");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("You have entered a number outside the range. Try again.");
        return getInt(min, max);
    }

    public int getInt(){
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public double getDouble( double min, double max){
        System.out.println("Enter a number between min and max: ");
        double userInput = scanner.nextDouble();
        if( userInput >= min && userInput <= max){
            return userInput;
        }
        System.out.println("You have entered a number outside the range. Try again.");
        return getDouble(min, max);
    }

    public double getDouble(){
        return scanner.nextDouble();
    }
}
