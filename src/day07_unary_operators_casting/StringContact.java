package day07_unary_operators_casting;

public class StringContact {
    public static void main(String[] args) {
        System.out.println("java"+  5 + 3);
        System.out.println("java" + ( 5 + 3 ));

        System.out.println(5 + (+ 3 + "java"));
        System.out.println("hello" + 1  + 2 + 3);
        System.out.println("hello" + (1  + 2 + 3));
        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2);
        System.out.println( str1 +" "+ str2 );//hello friends

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);//15
        System.out.println(num1 + " " + num2);//7 8
        System.out.println(num1 + "" + num2);//78

        char char1 = 'a';//97
        char char2 = 'b';//98
        System.out.println(char1 + char2);//195
        System.out.println(char1 + " " + char2); //a b

    }
}
