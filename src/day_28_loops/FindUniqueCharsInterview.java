package day_28_loops;

/**
 * give a string retrieve and print only unique characters
 */
public class FindUniqueCharsInterview {
    public static void main(String[] args) {
        String word = "javva";
        String unique = "";
        for(int i = 0; i < word.length(); i++ ){
           // System.out.println(word.charAt(i));
            //if word.charAt(i) is not contain in unique
            //add to unique
            if(!unique.contains(word.charAt(i)+"")){
                unique+= word.charAt(i);
            }
        }
        System.out.println(unique);

    }

}
