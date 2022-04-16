package day_40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayLIst {
    public static void main(String[] args) {
        //declare raw arraylist
        ArrayList list1 = new ArrayList<>();

        List list2 = new ArrayList();
        //add value
        list1.add("java");
        list1.add(1234);
        list1.add(true);
        System.out.println(list1);
        System.out.println("size =" +list1.size());

    }
}
