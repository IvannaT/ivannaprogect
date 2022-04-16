package day08_relational_operators_shorthand10_m;

public class SignType {
    public static void main(String[] args) {

        int number = 80;
        boolean isPositive = number > 0;
        boolean isNegative =number < 0;
        boolean isZero = number == 0;
        System.out.println("Is number positive "+isPositive);//true
        System.out.println("Is number negative " +isNegative);//false
        System.out.println("Is number 0 " + isZero);//false

    }

}
