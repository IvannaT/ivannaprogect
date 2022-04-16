package ivanna_new_progect;

import java.util.Scanner;

public class Statenent {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
              int number = input.nextInt();//-5

        //WRITE YOUR CODE BELOW
        if (number % 2 == 0) { //2,4,8,10,-2,-4,-8-8
            System.out.println(number + " is even");
        } else if (number % 2 == 1 ) {  //5,3,1,7,9,11,15
            System.out.println(number + " is odd");//5
        }else if ( number % -2 == - 1) {  //-5,-3,-1,-7,
                System.out.println(number + " is odd");
        } else {
            System.out.println("The number" + number + " will not be an input");

        }


    }
}