package day_43_arraylist_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetRandomList {
    public static void main(String[] args) {
        System.out.println("getRandomList() = "+getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = "+nums.size());
        System.out.println("nums = "+ nums);
        nums.removeIf(n -> n <90); //removes nums less than 90
        System.out.println("nums less than 90 = "+ nums);


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
