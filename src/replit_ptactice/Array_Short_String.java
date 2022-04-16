package replit_ptactice;

import java.util.Arrays;

public class Array_Short_String {
    public static void main(String[] args) {

        String [] words = {"Ivannna","Ceasar","Oleg","Fati"};

        String shortestWord = words[0];
        String allShortest = "";


        for (int i = 0; i < words.length; i++) {

            if(words[i].length() < shortestWord.length()){
                shortestWord = words[i];
            }
        }
        for (String each: words) {
            if(each.length() == shortestWord.length()){
                allShortest += each+",";
            }
        }
        System.out.println(allShortest);
        String[]arr = allShortest.split(",");
        System.out.println(Arrays.toString(arr));

    }
}


