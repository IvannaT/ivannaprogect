package day_40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
       List<String> shoppingLIst = new ArrayList<>();
        System.out.println("Size = "+ shoppingLIst.size());
        System.out.println("IsEmpty = "+shoppingLIst.isEmpty());
        if(shoppingLIst.isEmpty()){
            System.out.println("List is empty <keep coding java");
        }else{
            System.out.println("List is not empty");
        }
        shoppingLIst.add("shoes");
        shoppingLIst.add("cheap monitor");
        shoppingLIst.add("mask");
        shoppingLIst.add("wooden spoon");
        shoppingLIst.add("scooter");
        shoppingLIst.add("java book");
        shoppingLIst.add("tesla");
        if(shoppingLIst.isEmpty()){
            System.out.println("List is empty <keep coding java");
        }else{
            System.out.println("List is not empty");
        }
        int count = shoppingLIst.size();
        System.out.println("items to buy = " +count);

        System.out.println("Is shoes in my list ? "+shoppingLIst.contains("shoes"));
        if(shoppingLIst.contains("shoes")){
            System.out.println("Shoes is in the list ");
        }else{
            System.out.println("Shoes is not in the list ");
        }
        System.out.println("Buying shoes ... $80");
        shoppingLIst.remove("shoes");
        System.out.println("list (no shoes) = " +shoppingLIst);
        System.out.println("Done shopping");
        shoppingLIst.clear();
        System.out.println("Empty list" +shoppingLIst);
    }

}
