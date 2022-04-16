package day15_logical_operotors_If_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
       double budget = 5000.0;
       String model = "Tesla";
       double carPrise = 8999.0;
       if(carPrise <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
           System.out.println("Ready to purchase model = " + model +", price =" + carPrise);
       }else{
           System.out.println("Not intrested in model = " + model + ",price = " + carPrise);
       }
    }
}
