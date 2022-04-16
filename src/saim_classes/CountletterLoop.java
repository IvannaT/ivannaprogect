package saim_classes;

public class CountletterLoop {
    public static void main(String[] args) {


        // Given a String we want to count how many 'a' characters we have

//    Challenge: adjust so that we can check for not only 'a' but any character

//    Ex: aabbcaa

        String word = "aabbcca";
        char letter = 'c';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {  // checks if every character is equal to a
                count++;
            }
        }
        System.out.println(count);

        String  word2 = "spoon";
        char ofLetter = 'o';
        int count2 = 0;
        for(int i = 0; i < word2.length();i++){
            if(word2.charAt(i) == ofLetter){
                count2++;
            }
        }
        System.out.println(count2);
    }
}



