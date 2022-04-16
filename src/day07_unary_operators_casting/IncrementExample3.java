package day07_unary_operators_casting;

public class IncrementExample3 {
    public static void main(String[] args) {
         int i = 5;//6
         int z = i++;//5
        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b  = a +1;
        System.out.println(a);
        System.out.println(b);

        int c = ++a;
        System.out.println(c);
        System.out.println(a);

        int cars=  5;
        System.out.println(++cars);//6
        int sedans = 10;
        System.out.println(sedans++);//10++
        System.out.println(sedans);//11



    }
}
