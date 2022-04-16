package day_33_arrays;

import java.util.Arrays;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        String[] words ={"java", "html", "js", "ruby", "css" };
        System.out.println("before reverse = " + Arrays.toString(words));
        for(int i = 0, j = words.length-1 ; i < words.length/2; i++,j--){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("words after reverse = "+ Arrays.toString(words));

        int temp;
        int a = 5;
        int b = 10;
        temp = 5;
        a = b; //10
        b= temp;  //5

        System.out.println(a);
        System.out.println(b);





    }

}
