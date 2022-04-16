package day_28_loops;
import java.util.*;
public class RandomPasswordInterviewQuestion {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*";
        Random random = new Random();
        String password = "";
        for(int i = 1; i <= 8; i++) {
            //System.out.println(random.nextInt(source.length()));
           int index = random.nextInt(71);//random num 0-70 length of source
            System.out.print(source.charAt(index));
             //source.substring(index,index +1);
            // password = password+ source.charAt(index);
            //add char to password variable using +=
            password += source.charAt(index);
        }
        System.out.println("\nYour password = " +password);
    }
}
