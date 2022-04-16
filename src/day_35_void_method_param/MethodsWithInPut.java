package day_35_void_method_param;

public class MethodsWithInPut {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(1);
        int count = 55;
        displayValue(count);
        greetByName("Saim");
        greetByName("Oleg");
       String name = "Caesar";
       greetByName(name);

    }
    public static void displayValue(int num) {
        System.out.println("value is " + num);

    }
    public static void greetByName(String name){
        System.out.println("Hello " +name+" ,how are you today? ");

    }

}
