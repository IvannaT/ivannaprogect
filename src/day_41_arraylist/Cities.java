package day_41_arraylist;
import java.util.*;
public class Cities {
    public static void main(String[] args) {
        //declare arrayList
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //ad ashgabad to 1 index
        cities.add(0,"Ashgabat");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("First city = " +cities.get(0));
        System.out.println("Last city( by index) = " +cities.get(5));
        //find last index using size method
        System.out.println("Last city = " +cities.get(cities.size()-1));
        //print count of items in arraylist
        System.out.println("count of items = "+ cities.size());
        int size = cities.size();
        System.out.println("size = " +size+ " cities in the list");
        //for loop and print all values in the same line
        for(int i = 0;i < cities.size();i++) {      //2 half
            System.out.print(cities.get(i) + " ");

        }
        System.out.println();
        for( String city : cities) {
            System.out.print(city +" ");
        }
        System.out.println();
        //delete item from arraylist
        //1)remove using index
        cities.remove(3);
        //2)remove adding index
        cities.remove("New York");
        System.out.println("After remove = " +cities);

        //remove/delete all values
        //check its clear: 1print or using 2isEmpty,3 check size
        cities.clear();
        System.out.println("Clear = " +cities);

        if(cities.isEmpty()){
            System.out.println("List is empty");
        }
        if(cities.size() == 0){
            System.out.println("List is empty");
        }


    }
}
