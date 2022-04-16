package day9_scanner_murodil;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter hourly rate:" );
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double mounthlyPay = weeklyPay * 52 / 12;
        double annualPay = mounthlyPay * 12;

        System.out.println("Weekly pay:" + weeklyPay);
        System.out.println("Mounthly pay: " + mounthlyPay);
        System.out.println("Annual pay: "+ annualPay);





    }

}
