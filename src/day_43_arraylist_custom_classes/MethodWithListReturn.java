package day_43_arraylist_custom_classes;
import java.util.*;
public class MethodWithListReturn {
    public static void main(String[] args) {
       // System.out.println(System.nanoTime());
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList();  //returns ready arraylist object ,no need new array
        long end = System.nanoTime();

        System.out.println("ArrayList time = "+(end - start));
        long st = System.nanoTime();
        int [] arr = getIntegerArray();
        long en = System.nanoTime();
        System.out.println("Array time = " +(en -st));
        //System.out.println(mlnNums);
    }

    //getIntegerlist,noparams,return List<Integer>,loop 0 to 10000,add to arraylist then return it
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray() {
        int[] nums = new int[1000001];
        for (int i = 0; i <= 100000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}




