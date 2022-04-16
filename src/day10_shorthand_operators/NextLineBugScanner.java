package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBugScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and mounth: ");
        double rent = scan.nextDouble();
        scan.nextLine();
        String mounth = scan.nextLine();
        System.out.println("rent = "+ rent);
        System.out.println("mounth = " + mounth);
    }

}
