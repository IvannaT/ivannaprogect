package day_27_forloop_practice;

public class IndexOffFindLetter {
    public static void main(String[] args) {
        String word = "github";
        char letter ='g';
        int index = -1;
        for(int n = 0; n < word.length(); n++) {
           // System.out.println(n + " - " + word.charAt(n));
            if(word.charAt(n) == letter){
                index = n;
                System.out.println(letter+ " is found index " + index);
                break;
            }
        }
        if(index == -1){
            System.out.println(letter+ " is not present" + index);
        }
    }
}
