package day_31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-5,23,123,654,2344,2344,12345,14421,};
        System.out.println(Arrays.binarySearch(nums,23));
        System.out.println(Arrays.binarySearch(nums,2338));
        System.out.println(Arrays.binarySearch(nums,25));
        System.out.println(Arrays.binarySearch(nums,700));
        System.out.println(Arrays.binarySearch(nums,-5));

        if(Arrays.binarySearch(nums,12345)>=0){
            System.out.println("12345 present in array");
        }else{
            System.out.println("12345 not present in array");

        }


    }
}
