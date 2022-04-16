package day_42_arrayList_collections;
import day_41_arraylist.ArrayAsList;
import sun.jvmstat.perfdata.monitor.protocol.local.LocalEventTimer;

import  java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size  = "+ letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " +letters);
        Collections.frequency(letters,'a');
        System.out.println(Collections.frequency(letters,'a'));
        int vCount = Collections.frequency(letters,'v');
        System.out.println("vCount" + vCount);
        System.out.println("max char = "+ Collections.max(letters));
        System.out.println("min char = "+ Collections.min(letters));
        Collections.reverse(letters);
        Collections.replaceAll(letters,'a','u');
        Collections.replaceAll(letters,'i','j');
        System.out.println("after replaceAll = "+ letters);
//from small to big
        Collections.sort(letters);
        System.out.println("after sort = " + letters);

        List<Integer> nums = Arrays.asList(23,2,43,5,234,7,-9,0,5,5,5,5);
        System.out.println("nums = "+ nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);
//max number
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        //count how many 5
        int countto5 = Collections.frequency(nums, 5);
        System.out.println("countto5 = " + countto5);
        //replace all
        Collections.replaceAll(nums,5,50);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(("after reverse sort = " + nums));
        //shuffle
        Collections.shuffle(nums);
        System.out.println("after shaffle = " +nums );
    }
}
