package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args) {

        int yearOfBirth = 1988;
        int currentYear = 2022;
        int age = currentYear - yearOfBirth;
        System.out.println(age);
        System.out.println("I am " + age + " years old.");
    }
}
