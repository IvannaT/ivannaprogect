package day_36_methods_with_return;

import java.util.*;
public class InfoRandom {
    public static void main(String[] args) {
        System.out.println("Full name :" + fullName());
        System.out.println("Married status: " + isMarried());
        System.out.println("Age:" + getAge());
        System.out.println("Find random year: "+getRandomYear());
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name " +name);
        System.out.println("married "+married);
        System.out.println("age "+age);
        System.out.println("year "+year);


        }

    public static String fullName() {
        System.out.println("Inside full name");
        return "Mike Smith";
    }
    public static boolean isMarried() {
        return false;
    }
    public static int getAge() {
        int age = 35;
        return age;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2022);
        return randomYear;
    }
}

