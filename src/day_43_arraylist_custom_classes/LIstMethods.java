package day_43_arraylist_custom_classes;

import java.util.List;
import java.util.*;
public class LIstMethods {
    public static void main(String[] args) {
        System.out.println(getDays());//print days
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = "+ dayNames);

        //remove words with 6 letters without loop
        dayNames.add("java day");
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = "+ dayNames);

        System.out.println("getRandomList() = "+getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = "+nums.size());
        System.out.println("nums = "+ nums);
        nums.removeIf(n -> n <90); //removes nums less than 90
        System.out.println("nums less than 90 = "+ nums);


    }
    public static List<String> getDays() {

        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
       List<String>days = new ArrayList<>();
       days.add("Monday");days.add("Tuesday");days.add("Wednesday");
       days.add("Thursday");days.add("Friday");days.add("Saturday");days.add("Sunday");

        return days;
    }
    //getRandomList,param:int size,return List<Integer>,generate random num(0-100)the count of size,and assign to list then return getRanomList(3)-.43,12,54
    public static List<Integer> getRandomList(int size){
       Random random = new Random();//new random object
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            nums.add(random.nextInt(101));//generate random numbers and add to list
        }
        return nums;

    }
}
