package day_37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 443, 222);
        addNumbers(12,  12);
    }
    public static void addNumbers(int... nums){
        int sum = 0;
        for(int each : nums){
            sum += each;
        }
        System.out.println("sum = " + sum);
    }
}
