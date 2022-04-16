package replit_ptactice;

public class UniqueLetter {
    public static void main(String[] args) {
        String word = "ivanna";
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            if(!newWord.contains(word.charAt(i) +"")){
                newWord += word.charAt(i)+ "";
            }
            continue;
        }
        System.out.println(newWord);
    }
}
