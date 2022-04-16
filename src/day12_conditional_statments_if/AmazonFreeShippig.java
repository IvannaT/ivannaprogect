package day12_conditional_statments_if;

import java.util.Scanner;

public class AmazonFreeShippig {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your order total prise");

        double totalPrice = scan.nextDouble();
        if(totalPrice >= 25.0) {
            System.out.println("Your free shipping eligible :$" + totalPrice);
        }else {
            System.out.println("Not eligible for free shipping. Your order total :$ "+totalPrice);
            System.out.println("Thank for shoping  Amazone");
        }

    }
}
