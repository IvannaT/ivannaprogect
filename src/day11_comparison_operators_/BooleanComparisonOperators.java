package day11_comparison_operators_;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);//true
        System.out.println(1000 > 100);//true
        System.out.println(95.55 < 384.4);//true
        System.out.println(10<=11);//true
        System.out.println(5 >=3);//true
        System.out.println(-100 != 44);//true  100 not equal  to 44 \\if its not equal give us true

        int a = 100;
        int b = 200;
        System.out.println(a == b);//false
        System.out.println(a > b);//false
        System.out.println(a < b);//true
        System.out.println(a >= b );//false
        System.out.println(a <= b);//true
        System.out.println(a != b);//true

        boolean result;
        result = 5 == 5;//true
        System.out.println("result : " + result);
        result = 33 > 44;//false
        System.out.println(result);
        result = 33 < 44;//true
        System.out.println(result);
        result = 10 >= 10 ;//true
        System.out.println(result);
        result = 123<= 124;//true
        System.out.println(result);
        result = 2!= 2;//false
        System.out.println(result);

        String city = "Seattle";
        System.out.println(city == "Seattle" );


int hours = 3690/3600;
        System.out.println(hours);
      int  minutes = 3690%3600/60;
        System.out.println(minutes);

        int  seconds =3690%3600%60;
        System.out.println(seconds);





    }
}
