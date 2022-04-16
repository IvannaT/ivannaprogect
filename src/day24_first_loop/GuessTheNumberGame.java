package day24_first_loop;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNUm = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNUm.nextInt(101);
        int guessingNumber = 0;
        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNumber) {
                System.out.println("wrong,your number is too large");
            }else if(guessingNumber < secretNumber){
                System.out.println("your number is too small");
            }
        }while(secretNumber != guessingNumber);
        System.out.println("your number is : " +secretNumber);




    }
}
