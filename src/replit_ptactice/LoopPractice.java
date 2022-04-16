package replit_ptactice;

import java.util.Locale;

public class LoopPractice {
    public static void main(String[] args) {
        String word = "CaeSar";
        String word2 ="";
        for (int i = word.length()-1;i >= 0;i--){
            word2 += word.charAt(i);
        }
        System.out.println(word2);
        System.out.println(word2.toLowerCase());

        StringBuilder stringBuilder = new StringBuilder(word).reverse();
        System.out.println(stringBuilder);







            }

        }


