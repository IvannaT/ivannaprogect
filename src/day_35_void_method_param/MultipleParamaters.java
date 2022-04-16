package day_35_void_method_param;

import java.util.Scanner;

public class MultipleParamaters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles: ");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1, d2);

        showSum(15.12, 13.12);
    }
    public static void showSum(double num1,double num2){
        double sum = num1 + num2;
        System.out.println("The Sum = " +sum);

    }
}
