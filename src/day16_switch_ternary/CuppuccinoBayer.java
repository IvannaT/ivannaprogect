package day16_switch_ternary;

public class CuppuccinoBayer {
    public static void main(String[] args) {
        double price = 0;
        int calories = 0;
        String size = "grande";

        switch(size){
            case "tall":
                price = 2.50;
                calories = 400;
                System.out.println("Tall cuppuccino please");
                break;
            case "grande":
                price = 3.30;
                calories = 500;
                System.out.println("Grande cappuccino please");
                break;
            case "venti":
                price = 4.50;
                calories = 600;
                System.out.println("Venti cappuccino please");
                break;
            default:
                System.out.println("WE dont serve that " + size + "Cappuccino");
                break;


        }
        System.out.println("Total price $: " + price) ;
        System.out.println("You will consume " +calories + " calls of energy");

    }

}
