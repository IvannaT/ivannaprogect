package day_36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(777);
        checkEligible(697);
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " +getCreditScore()) ;
        int score = getCreditScore();
        System.out.println("score = " +score);


    }
    public static void checkEligible(int creditScore) {
        if(creditScore >= 700){
            System.out.println("You are eligible for leasing this car");
        } else{
            System.out.println("Sorry you are not legible");
        }
      }
      public static int getCreditScore(){
        return 800;
      }
    }

