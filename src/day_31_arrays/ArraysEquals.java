package day_31_arrays;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import  java.util.*;
public class ArraysEquals {
    public static void main(String[] args) {
        int[] num1 = {4, 5, 2, 10};
        int[] num2 = {4, 5, 2, 10};
        int[] num3 = {4, 5, 2, 2};
        int[] num4 = {4, 5, 2, 10, 90};
        int[] num5 = {54, 23, 54, 123, 454};
        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println("num1 == num2 - " + Arrays.equals(num1, num2));
        System.out.println(num1 == num2);
        if (Arrays.equals(num1, num2)) {
            System.out.println("num1 and num2 are match");
        } else {
            System.out.println("num1 and num2 are not match");
        }
        if (Arrays.equals(num2, num3)) {
            System.out.println("num2 and num3 are match");
        } else {
            System.out.println("num2 and num3 are not match");
        }
        System.out.println("cars1 == cars2- "+ Arrays.equals(cars1,cars2));

        System.out.println("cars2 == cars3- "+ Arrays.equals(cars2,cars3));
        if(Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))){
            System.out.println("cars2 == cars3 - ignoreCase");
        }


    }


}
