package day11_comparison_operators_;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1 = 10;
        //++num1 =11;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);//11
        System.out.println("num2 = " + num2);//11

        int num3 = 4;
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3);//5
        System.out.println("num4 = " + num4);//4


        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber);//45
        ++myNumber;
        System.out.println(myNumber);//46

        myNumber = 20;
        System.out.println(++myNumber);//21

        myNumber = 33;
        System.out.println(myNumber++);//33
        System.out.println(myNumber);//34

        myNumber = 34;
        int yourNumber = ++myNumber;//1+34
        System.out.println(myNumber);//35
        System.out.println(yourNumber);//35

        myNumber =35;
        yourNumber = myNumber++;
        System.out.println(myNumber);//35+1=36
        System.out.println(yourNumber);//35

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println(a);//50+1=51
        System.out.println(b);//23
        System.out.println(c);//73


    }
}
