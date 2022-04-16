package day_45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount = "+myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = "+myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = "+ myCoffee.getAmount());
       // myCoffee.type ="Latte";instead using method
        myCoffee.setType("Latte");
        System.out.println("coffee type  = " +myCoffee.getType());
        //describe myCoffee,show all variables
        System.out.println(myCoffee.toString());
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("Coffee 1 type = "+coffee1.getType());
        //hey java,point coffee to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee 2 type = "+ coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("new coffee 2 = "+ coffee2.getType());
        System.out.println("new coffee 1 type = "+coffee1.getType());
        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        System.out.println("coffee 3 type = "+coffee3.getType());
        coffee3 = coffee2;
        System.out.println("new coffee3 type ="+ coffee3.getType());
        Coffee coffee4 = null;
        coffee4.setType("turkish");//nullpointer exeption
    }
}
