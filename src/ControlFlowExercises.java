import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        While Loops

//        int i = 5;
//        while ( i <= 15){
//            System.out.println(i++);
//        }
//        _____________________________________________________________________

//        Do While Loops

//        int number = 0;
//        do{
//            System.out.println(number);
//            number += 2;
//        }while(number <=100);

//        int number = 100;
//        do{
//            System.out.println(number);
//            number -= 5;
//        }while(number >= -10);

//        long number = 2;
//
//        do{
//            System.out.println(number);
//            number *= number;
//        } while(number <= 1000000);
//        _______________________________________________________________________
//        for loop refactoring

//        for(int i =5; i<= 15; i++){
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }
//        _________________________________________________________________________

//        Fizz/Buzz

//        for(int i = 1; i <= 100; i++){
//            if( i % 3 == 0 && i % 5 ==0){
//                System.out.println("FizzBuzz");
//            }
//            else if( i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }
//        _________________________________________________________________________

//        Tables of Powers

        Scanner sc = new Scanner(System.in);

        boolean confirmation;
//
//        do{
//
//            System.out.println("what number do you want to go up to");
//            int usersNumber = sc.nextInt();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//
//            for( int i =1 ; i <= usersNumber; i++){
//                int squared = i * i;
//                int cubed = squared * i;
//                System.out.printf("%s      | %s       | %s %n", i , squared, cubed);
//            }
//
//            System.out.println("Continue? [y/n]");
//            String userInput = sc.next();
//            confirmation = userInput.equalsIgnoreCase("Y");
//
//        }while(confirmation);


//        _________________________________________________________________________

//        Letter Grades

        do{
            System.out.println("Enter a number between 0 through 100 for your number grade: ");
            Scanner gradeNumber = new Scanner(System.in);
            int grade = gradeNumber.nextInt();
            if (grade <= 100 && grade >= 88) {
                System.out.println("Your letter grade is an A");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("Your letter grade is a B");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("Your letter grade is a C");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("Your letter grade is a D");
            } else {
                System.out.println("Your letter grade is a F");
            }
            System.out.println("Continue? [y/n]");
            String userInput = sc.next();
            confirmation = userInput.equalsIgnoreCase("Y");

        }while(confirmation);

    }
}
