package day08_relational_operators_shorthand10_m;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 20;
        boolean isKid = age <= 13;
        boolean isSenior =age >=65 ;
        System.out.println("You are a kid : " + isKid);//20 < 13 true
        System.out.println("You are senior " + isSenior);//65 > 20 false

    }
}
