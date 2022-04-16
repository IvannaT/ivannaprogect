package day_32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " +words[0]);
        System.out.println("2nd word = " +words[1]);
        System.out.println("3rd word = " +words[2]);
         for(String each : words){
             System.out.println(each);
         }
                             //  0       1        2       3     4
         String googleResult = "About 1,810,000 results (0,68 seconds)";
         String[] results = googleResult.split(" ");
        System.out.println(Arrays.toString(results));
        System.out.println("Count = "+ results[1]);
        System.out.println("Seconds = "+ results[3].replace("(",""));
        System.out.println("Seconds = "+ results[3].substring(1) );
    }
}
