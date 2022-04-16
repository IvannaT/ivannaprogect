package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));
        System.out.println(word.substring(7, 11));
        System.out.println(word.substring(8, 11));
        System.out.println(word.substring(0, 11));//java is fun
        System.out.println(word.substring(8));//fun
        System.out.println(word.substring(5));//is fun
    }
}
