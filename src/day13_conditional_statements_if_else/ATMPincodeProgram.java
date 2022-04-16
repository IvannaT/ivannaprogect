package day13_conditional_statements_if_else;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("****WELCOME TO BANK ATM*****");
        int secretPicode = 2233;
        int inputPincode = 2233;
        if(secretPicode == inputPincode){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance,deposit");
        }else {
            System.out.println("Incorrect pincode!" + inputPincode );
            System.out.println("Please try again!");
        }




    }
}
