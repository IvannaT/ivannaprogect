package day08_relational_operators_shorthand10_m;

public class ShoppingBalanceCalculatorCasting {
    public static void main(String[] args) {

      double balance = 345.55;
      double price1 = 20.88;
      double price2 = 89.99;
      double price3 = 15.0;
      double remainingBalance = balance - price1 - price2 - price3;
      double balanceWithoutCents =(int) remainingBalance;


        System.out.println("Your initial balance :$" + balance);
        System.out.println("Your remaining balance :$" + remainingBalance);
        System.out.println("Your remaining balance without cents :$" + balanceWithoutCents);





    }
}
