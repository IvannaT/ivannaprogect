package day13_conditional_statements_if_else;
import java.util.Scanner;

public class FizzBus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {  // n % 15 == 0
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE BELOW
        String dayNumber = "";

        switch(day){
            case 1:
                dayNumber = "Monday";
                break;
            case 2:
                dayNumber = "Tuesday";
                break;
            case 3:
                dayNumber = "Wednesday";
                break;
            case 4:
                dayNumber = "Thursday";
                break;
            case 5:
                dayNumber = "Friday";
                break;
            case 6:
                dayNumber = "Saturday";
                break;
            case 7:
                dayNumber = "Sunday";
                break;
            default:
                dayNumber = "Not a valid day";
                System.out.println(dayNumber);
        }

    }
}
