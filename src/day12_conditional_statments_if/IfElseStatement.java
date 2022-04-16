package day12_conditional_statments_if;

public class IfElseStatement {
    public static void main(String[] args) {

        if (10 > 5) {
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }

        int count = 25;
        if (count > 30){
            System.out.println("count is more than 30");
        }else{
            System.out.println("count is less than 30");
        }

        byte age = 25;
        if (age >= 18 ){
            System.out.println("Eligible to vote");
            System.out.println("Age is greaather or equal to 18");
        }else{
            System.out.println("Not Eligible to vote");
            System.out.println("Age is less than 18");
        }

    }
}
