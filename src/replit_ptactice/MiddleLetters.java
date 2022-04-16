package replit_ptactice;

public class MiddleLetters {
    public static void main(String[] args) {
        System.out.println(middleletter("Caesar"));
    }
    public static String middleletter(String word){
        String word2 = word.substring(word.length()/2-1, word.length()/2 + 2);
        return word2;
    }
}
