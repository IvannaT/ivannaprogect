package day07_unary_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        int num1 = 100;//num1:100
        byte b1 =(byte) num1; //b1:100
        short shNum1 = (short)num1;//shNum1 :100;
        long lNum1 = num1;//100
        System.out.println(num1);//b1:100
        System.out.println(b1);//num1:100
        System.out.println(shNum1);//shNum:100

        /*  int n1 = 4;
            byte b1 = n1 ===== error

        int n1 = 4;
        byte b1 = (byte) n1;

        byte b2 = 55;
        int n2 = b2;
        */


    }

}
