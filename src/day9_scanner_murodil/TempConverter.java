package day9_scanner_murodil;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("####F to C Converter Program");
        System.out.println("Enter Fahrenheit value: ");
        double fahrenheitValue = scan.nextDouble();
        double celciusValue = (fahrenheitValue -32) * 5 / 9;
        System.out.println(fahrenheitValue + " F is in C");

    }
}
