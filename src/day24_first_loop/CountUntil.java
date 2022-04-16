package day24_first_loop;
import java.util.*;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int numberStop = scan.nextInt();
        int start = 1;

        while(start <= numberStop){
            System.out.print(start + " ");//one line?
            start++;

        }
    }
}
