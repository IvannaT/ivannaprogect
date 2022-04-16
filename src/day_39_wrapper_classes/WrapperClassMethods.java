package day_39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println(Double.max(234.4,234.5));
        //System.out.println("args = " +args);
        System.out.println("max double " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));//1. larger than give you second ;1
        System.out.println(Double.compare(5,5));//0 equal
        System.out.println(Double.compare(5,45));//-1 than first is smaller than second

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('V'));
        System.out.println(Character.isAlphabetic('q'));
        System.out.println(Character.isUpperCase('r'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('8'));
        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
            String word = "JaVa iS FuN";
            for(int i = 0; i < word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    System.out.print(word.charAt(i));
                }

            }
        }





    }
}
