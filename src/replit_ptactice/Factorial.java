package replit_ptactice;
import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int result = 1;

            for(int i = n; i >=0; i--){
                result = result * i;
                System.out.print(i*(i+1)+" "+result);

            }
        }
    }

