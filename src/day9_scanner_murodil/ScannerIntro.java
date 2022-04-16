package day9_scanner_murodil;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = scan.next();
        System.out.println("nice to meet you, " + firstName);

    }
}
