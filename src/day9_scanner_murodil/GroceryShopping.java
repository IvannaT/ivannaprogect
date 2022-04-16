package day9_scanner_murodil;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price for milk: ");
        double price1 = scan.nextDouble();

        System.out.println("Enter price for bread: ");
        double price2 = scan.nextDouble();

        System.out.println("Enter price cucumber: ");
        double price3 = scan.nextDouble();

        double total = price1 + price3 + price3;
        System.out.println("Total prise: $" + total);
    }
}
