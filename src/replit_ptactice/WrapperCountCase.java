package replit_ptactice;

public class WrapperCountCase {
    public static void main(String[] args) {
        String word = "JaVa iS FuN";
        for(int i = 0; i < word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){//isLovercase
                System.out.print(word.charAt(i));
            }

        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Boolean.TRUE);
    }

}

