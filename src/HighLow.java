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
        boolean moveAHead = true;
        System.out.println("A number has been choose. Make your guess!!...");
        long value = randomNumber(100);
        int guessCount = 0;
        while(moveAHead){
            int guess = scanner.nextInt();
            if(guess == value){
                System.out.println("Good Guess");
                if(guessCount <= 10){
                    System.out.printf("Nice work took you %s tries.",guessCount);
                }
                else{
                    System.out.printf("Only took you %s tries...loser.",guessCount);
                }
                moveAHead = false;
            }else if( guessCount == 15){
                System.out.println("TOO MANY GUESSES!!!");
                moveAHead = false;

            }
            else if( guess > value){
                System.out.println("LOWER!!!");
                guessCount++;
            }
            else if( guess < value){
                System.out.println("HIGHER!!!");
                guessCount++;

            }
        }


    }

}
