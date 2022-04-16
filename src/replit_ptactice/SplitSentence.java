package replit_ptactice;
import java.util.*;
public class SplitSentence {
        public static void main(String[] args) {
            //DO NOT TOUCH BELOW:
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();

            //TYPE YOUR CODE BELOW:
            String[]sentenceArray  = sentence.split(" ");
            for(String each :sentenceArray){
                System.out.println(each);

            }
        }
    }

