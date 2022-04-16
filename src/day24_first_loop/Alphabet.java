package day24_first_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter + "");
            letter++;
        }
        System.out.println();
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter+ "");
            letter--;
        }
    }
}
