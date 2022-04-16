package replit_ptactice;

public class ReverseString {
    public static void main(String[] args) {
        String word = "ivanna";
        String newWord = "";

        for(int i = word.length()-1; i >= 0; i--){
            newWord += word.charAt(i) + "";
        }
        System.out.println(newWord);


    }
}
