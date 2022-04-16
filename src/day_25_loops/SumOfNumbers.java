package day_25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        //int1+1=2+1=3+1=4+1=5;stop
        //sum1+2=3 6+4=10 =15

        for (int i = 0;i <= 10; i++ ){
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum = " + sum);



    }
}