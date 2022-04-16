package day_42_arrayList_collections;
import java.util.*;
public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html");words.add("selenium");words.add("a");words.add("input");words.add("title");
        //pass the words list to printList method
        printStrList(words);
        printStrList(Arrays.asList("select","option","br","python","sql","api"));


        List<Integer> nums =Arrays.asList(23,54,54554,234,11,5,2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }

    public static void  printStrList(List<String> stringList) {
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();

    }
        public static int sumIntegerList(List<Integer> list) {
           int sum = 0;
           for( int i:list){
               sum +=i;
           }
           return sum;



        }

        }


