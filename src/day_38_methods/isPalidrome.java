package day_38_methods;

import day_36_methods_with_return.Calculations;
import day_36_methods_with_return.Calculator;

import java.util.*;

public class isPalidrome {
    public static void main(String[] args) {
        System.out.println(isPalidrome("kayak"));
    }
    public static boolean isPalidrome(String str) {
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 -i )) {
                return false;
            }
        }
        return true;
    }
}




