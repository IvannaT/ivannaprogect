package day_40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500);nums.add(5);nums.add(845);nums.add(0);
        nums.add(500);nums.add(5);nums.add(845);nums.add(0);

        System.out.println("nums = " +nums );
        nums.remove(0);
        System.out.println("nums = " +nums );

       // nums.remove(88); - index 88, declare need to remove number
        nums.remove(new Integer(88));
        System.out.println("nums(no 88) = "+ nums);
        // remove 5 number(will remove just first for all need loop
        nums.remove(new Integer(5));
        System.out.println("nums (no 5) =" + nums);


        //for loop - iterate through all values and print
        for(int i = 0; i < nums.size();i++) {
            System.out.println(nums.get(i));
        }
            //for each loop(Integer)
            for(int each : nums){
                System.out.print(each +" ");
            }

        }



    }

