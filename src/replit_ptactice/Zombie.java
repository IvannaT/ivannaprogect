package replit_ptactice;
import java.util.*;
public class Zombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        while (inhabitants >0 ){
            System.out.println("Day " + day + " [" +  +inhabitants + "]");
            inhabitants = inhabitants/2;
            System.out.println(inhabitants);
            day++;
        }
        System.out.println("----EXTINCT----");
    }
}
