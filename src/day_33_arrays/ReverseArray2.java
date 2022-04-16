package day_33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[]nums = {5,10,4,100};
        int temp = nums[0];
        System.out.println("before swab;" + Arrays.toString(nums));
        temp = nums[0];
        nums[0] =nums[3];
        nums[3]= temp;
        System.out.println("after swab;" + Arrays.toString(nums));

        int[]nums2 ={5,10,4,100};
        System.out.println("Before :"+Arrays.toString(nums2));
         for(int i = 0; i < nums2.length/2; i++) {
             int temp2 = nums2[i];
             nums2[i] = nums2[nums2.length -1 - i];
             nums2[nums.length -1 - i] = temp2;
         }
        System.out.println("After: "+ Arrays.toString(nums2));




        }

    }

