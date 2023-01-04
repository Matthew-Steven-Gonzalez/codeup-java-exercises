import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Boolean confirmation;
        System.out.println("Hi, I am Bob, Just your average lackadasical teenager.");

        do{
            System.out.println("So What up?");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.length() == 0) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Keep Talking to Bob? [yes/no]");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("Yes");
        }while(confirmation);
        System.out.println("Bob left...");
    }
}
