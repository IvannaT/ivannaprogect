package day12_conditional_statments_if;

public class CompareChars {
    public static void main(String[] args) {

        char letter1 = 'A';//65
        char letter2 = 'J';//74
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2 );
        System.out.println(letter2 > letter1);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam ?" + pass);

    }
}
