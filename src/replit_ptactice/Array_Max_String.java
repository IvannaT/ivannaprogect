package replit_ptactice;

public class Array_Max_String {
    public static void main(String[] args) {
        String [] words = {"Ivan","Ceasar","Oleg"};


        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {

           if(words[i].length()>longestWord.length()){
               longestWord = words[i];
           }
        }
        System.out.println(longestWord);

    }
}
