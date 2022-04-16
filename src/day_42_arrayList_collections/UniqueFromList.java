package day_42_arrayList_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        //declare integer arraylist with following numbers
        List<Integer> nums =new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        //new arraylist to store only unique numbers
        List<Integer> uniqueList = getIntegers(nums);
        System.out.println("\nuniqueList = "+ uniqueList);
    }

    public static List<Integer> getIntegers(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();
        //loop through the list
        for(int num : nums){
            //check of number appears only 1 in the list
           if(Collections.frequency(nums,num) == 1){
               //print number
               System.out.print(num + " ");
               uniqueList.add(num);
           }
        }
        return uniqueList;
    }
}
