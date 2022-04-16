package replit_ptactice;

import java.util.Arrays;

public class Expand {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] num2 = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            num2[i]=nums[i];
        }
        System.out.println(Arrays.toString(num2));
    }
}

