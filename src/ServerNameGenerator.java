import java.util.Arrays;

public class ServerNameGenerator {
    public static String[] nouns = new String[10];

    public static String[] adjectives = new String[10];

    public static String randomizer(String[] array){
        int randomInt = (int) (Math.random() * array.length);
        return array[randomInt];
    }

    public static void main(String[] args) {
        nouns[0] = "Car";
        nouns[1] = "Bike";
        nouns[2] = "Scooter";
        nouns[3] = "Skateboard";
        nouns[4] = "Snowboard";
        nouns[5] = "Ski";
        nouns[6] = "Tricycle";
        nouns[7] = "Horse";
        nouns[8] = "Carriage";
        nouns[9] = "Boat";
        adjectives[0] = "Cheap";
        adjectives[1] = "Frugal";
        adjectives[2] = "Affordable";
        adjectives[3] = "Buyer-friendly";
        adjectives[4] = "Budget-approved";
        adjectives[5] = "Wallet-pleaser";
        adjectives[6] = "Low-cost";
        adjectives[7] = "Inexpensive";
        adjectives[8] = "Economic";
        adjectives[9] = "reasonable";

        System.out.printf("Here is your server name: %n"+(randomizer(adjectives)) +"-" + randomizer(nouns));
    }
}
