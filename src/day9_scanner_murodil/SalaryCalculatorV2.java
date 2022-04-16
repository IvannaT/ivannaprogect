package day9_scanner_murodil;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyPay = scan.nextDouble();
        double weeklyPay = hourlyPay * 40;
        double mounthlyPay = weeklyPay * 52 / 12;
        double annualPay = mounthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Mounthly pay: " + mounthlyPay);
        System.out.println("Annual pay: "+ annualPay);
    }
}
