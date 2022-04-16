package day_37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum(10,5);
        sum(10.4, 12.4);
        sum(10, 5.5);
        sum((int)4.2,1,2);//casting to ind ,gonna remove decimal point (4)
        sum("Hello","World");


    }
    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1,int num2)");
        System.out.println("result = " + (num1 + num2));
    }

    public static void sum(int num1, int num2,int num3) {
        System.out.println("sum(int num1,int num2)");
        System.out.println("result = " + (num1 + num2));
    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double num1,double num2)");
        System.out.println("result = " + (num1 + num2));

    }
    public static void sum(String str1, String str2) {
        System.out.println("sum(String,String)");
        System.out.println("result = " + (str1 + str2));
    }

    }