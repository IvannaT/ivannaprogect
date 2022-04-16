package replit_ptactice;

public class LongestWord {
    public static void main(String[] args) {
       String word1 = "Oleg";
       String word2 = "Ivanna";
        System.out.println("longest word is :" +longWord(word1,word2));

    }
    public static String longWord(String str1, String str2){
        if(str1.length() > str2.length()){
            return str1;
        }else{
            return str2;
        }
    }
}
