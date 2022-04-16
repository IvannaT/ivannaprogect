package day24_first_loop;

import java.util.Scanner;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        do{
            System.out.println("Enter pin code: ");
            pinCode = scan.nextInt();
        }while(secretPinCode != pinCode);

        System.out.println("Welcome to your account");
    }
}
