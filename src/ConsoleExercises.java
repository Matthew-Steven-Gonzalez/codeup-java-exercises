import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

//        System.out.print("Enter a Number: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You Entered: -->\"" + userInput + "\"<---");

//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("You Entered: %n" + userInput1 +"%n" + userInput2 +"%n"+ userInput3);

//        System.out.print("Enter A sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);

        System.out.print("Enter length and width of the room:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = width * length;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("The area of the room is: %s%nThe perimeter of the room is: %s",area , perimeter );
    }
}
