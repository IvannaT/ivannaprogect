package day_26_loops;

public class CountMatchesAndChar {
    public static void main(String[] args) {
        String word = "Ivanna";
        char letter = 'a';
        int count = 0;
        for(int i = 0; i < word.length() ; i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("there are " + count + " "+ letter +" 'a in " + word );

    }
}
