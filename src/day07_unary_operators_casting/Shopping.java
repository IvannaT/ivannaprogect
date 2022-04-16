package day07_unary_operators_casting;

public class Shopping {
    public static void main(String[] args) {
        int numberOfItems = 0;
        double price = 0.0;
        System.out.println("we pick up one water");
        System.out.println("how many items in a cart? " + ++numberOfItems);//add 2 waters
        price = price + 2.5; //add price value
        System.out.println("we pick up 2 eggs");
        System.out.println("how many items in a cart? " + ++numberOfItems);


    }

}
