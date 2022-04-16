package replit_ptactice;

public class String_Amount_N {
    public static void main(String[] args) {
        String word = "ivanna novak";
        int count = 0;
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) == 'n'){
                count++;
            }
        }
        System.out.println(count);
    }
}
