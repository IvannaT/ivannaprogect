package day21_string_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String  word = "github";
        System.out.println(word.toUpperCase(Locale.ROOT));
        System.out.println(word.replace("hub","lub"));
        System.out.println("word = " + word);
        word = word.replace("hub", "lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i' , 'o').replace('a', 'i'));
        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpace);
        sentence = sentence.replace("java" , "selenium").replace("fun", ("a lot of fun"));
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over", "");
        result = result.replace(",","");
        result = result.replace("results for java book", "");
        System.out.println("result = " + result);






    }
}
