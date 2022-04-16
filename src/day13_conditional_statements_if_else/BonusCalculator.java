package day13_conditional_statements_if_else;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus =0;
        double salesAmmount =500.0;
        if (salesAmmount<=2000){
            System.out.println("Good job,you are qualified for  a bonus! ");
            bonus = 50.0;
        }else {
            System.out.println("Great job, you are qualified for full bonus ");
        }
    }
}
