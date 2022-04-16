package day16_switch_ternary;

public class Apartmets {
    public static void main(String[] args) {
        System.out.println("********WELCOME TO APARTMETNTS*******");
        int numberOfBedrooms =1;
        double startingPrice = 0;

        switch (numberOfBedrooms){
            case 0:
                startingPrice = 1453.0;
                System.out.println("Studio apartment selected ");
                break;
            case 1:
                startingPrice = 2500.0;
                System.out.println("Onebedroom apartment selected");
                break;
            case 2:
                startingPrice = 3300.0;
                System.out.println("Two bedroom apartment selected");
            case 3:
                startingPrice =4500.0;
                System.out.println("Tree bedroom apartment selected");
            default:
                System.out.println(numberOfBedrooms + "bedroom currently unavailable");


        }
        System.out.println("Starting price :$ "+ startingPrice);


    }

}
