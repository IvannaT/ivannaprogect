package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherTodayScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today? ");
        //String weather = scan.next();//print word
        String weather = scan.nextLine();//print line
        System.out.println("weather = " + weather);
        System.out.println(weather + "- is a nice day today! ");

    }
}
