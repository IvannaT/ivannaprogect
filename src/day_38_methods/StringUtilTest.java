package day_38_methods;

import javax.swing.undo.AbstractUndoableEdit;
import java.util.*;

import java.util.Locale;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("Username cannot be null or empty");
        }
        System.out.println(isPalidrome("KAYAK"));
        System.out.println(reverse("oleg"));
        System.out.println(reverse("caesar"));

    }
      public static boolean isPalidrome(String str){
        str =str.toLowerCase(Locale.ROOT);
        for(int i = 0; i < str.length()-2;i++){
            if(str.charAt(i)!= str.charAt(str.length()-1 -i)){
                return false;
            }
        }
        return true;
      }


    public static String reverse(String str){
        String reversed ="";
        for(int i = str.length()-1; i >= 0; i--){
            reversed +=  str.charAt(i);
        }
        return reversed;

    }
}




