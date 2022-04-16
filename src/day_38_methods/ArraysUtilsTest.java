package day_38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23, 34, 34, 667, 788, 99987});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23, 34, 34, 667, 788, 9987}));
        int[] nums2 = {1, 3, 5, 8};
        System.out.println("found = "+ArrayUtils.contains(nums2,5));
        System.out.println("10 found = "+ArrayUtils.contains(nums2,10));
    }
}