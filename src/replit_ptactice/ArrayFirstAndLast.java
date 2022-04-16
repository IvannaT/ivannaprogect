package replit_ptactice;
import java.util.*;
public class ArrayFirstAndLast {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:

        //["hello", "why", "by", "apple" , "note"]
        for(int i =0;i < words.length;i++){
            System.out.println(words[i].charAt(0)+ "" + words[i].charAt(words[i].length()-1) );
        }
    }
}


