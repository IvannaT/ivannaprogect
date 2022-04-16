package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
      String word =  "woo den sp oon";
        System.out.println(word.toUpperCase(Locale.ROOT).toLowerCase(Locale.ROOT).length());
        System.out.println(word.replace(" ","").toUpperCase(Locale.ROOT));
        String  city = "rivne";
        System.out.println(city.substring(0,1).toUpperCase(Locale.ROOT)+city.substring(1).toLowerCase(Locale.ROOT));
        String capitalized = city.substring(0,1).toUpperCase(Locale.ROOT)+ city.substring(1).toLowerCase(Locale.ROOT);
        System.out.println("capitalized = " + capitalized);






    }
}
