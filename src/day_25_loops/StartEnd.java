package day_25_loops;

import java.util.Scanner;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter star and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if(start > end){
            System.out.println("reverse numbering is not supported");
        }
        for(int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}