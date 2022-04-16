package day_41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        //nums.add(100); not working, because array list is as they are ( cant change value

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,3,23,5344,100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList =" + numsList);
        numsList.remove(new Integer(23));
        System.out.println("numsList =" + numsList);


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster","red bull",
                "coke","pepsi","mdew","kambucha","celsius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount = 0;
        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " ---> " +caffeineAmount);
            }else if(drink.equals("coffee") || drink.equals("kambucha")){
                caffeineAmount = 112;
                System.out.println(drink + " ---> " +caffeineAmount);
            }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + " ---> " +caffeineAmount);
            }
        }
        for(String drink : drinksWithCaffeine ){
            switch (drink){
                case "monster" : case "red bull" : case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + "---> " +caffeineAmount);
                    break;
                case "coffee" : case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + "---> " +caffeineAmount);
                    break;
                case "tea" : case "coke" : case "pepsi":
                    caffeineAmount = 35;
                    System.out.println(drink + "---> " +caffeineAmount);
                    break;

            }
        }
        //lambda expression
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase(Locale.ROOT)));
        drinksWithCaffeine.forEach(each ->{
            System.out.println("_____");
            System.out.println("each ="+each);
            System.out.println("_____");

        } );


        }

    }

