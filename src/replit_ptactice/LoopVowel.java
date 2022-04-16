package replit_ptactice;
import java.util.*;
public class LoopVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for(int i = 0;i < word.length(); i++){
            char vowel = word.charAt(i);
            if(vowel =='a' || vowel == 'e' || vowel == 'o' ||  vowel == 'u') {
                System.out.print(vowel);

            }
        }
    }
}


