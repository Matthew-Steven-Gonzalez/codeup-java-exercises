import java.util.Scanner;

public class HighLow {

    public static Scanner scanner = new Scanner(System.in);
    public static long randomNumber(int max){
        return Math.round(Math.random()* max);
    }


    public static void main(String[] args) {
        theGame();
    }

    public static void theGame(){
        Boolean moveAHead = true;
        System.out.println("A number has been choose. Make your guess!!...");
        long value = randomNumber(100);
        while(moveAHead){
            int guess = scanner.nextInt();
            if(guess == value){
                System.out.println("Good Guess");
                moveAHead = false;
            }
            else if( guess > value){
                System.out.println("LOWER!!!");
            }
            else if( guess < value){
                System.out.println("HIGHER!!!");
            }
        }


    }

}
