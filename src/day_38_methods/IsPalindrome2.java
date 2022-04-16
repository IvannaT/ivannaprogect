package day_38_methods;

public class IsPalindrome2 {
    public static void main(String[] args) {
        System.out.println(isPalindromeWord("kayak"));
    }
    public static boolean isPalindromeWord (String str){
        int begin =0;
        int end = str.length()-1;
        while(begin < end){
           if (str.charAt(begin) != str.charAt(end)){
               return false;
           }
               begin++;
               end--;
        }
        return true;
    }
}
