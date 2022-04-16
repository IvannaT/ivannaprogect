package day19_class_vs_object_strings;

import java.util.Locale;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        if (countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }
        String word = "JAVA";
        String uWord = word.toUpperCase(Locale.ROOT);
        System.out.println(word);
        System.out.println(uWord);
        if(word.equals(uWord)){
            System.out.println("Print casematch");
        }else{
            System.out.println("Not print");
        }

    }
}
