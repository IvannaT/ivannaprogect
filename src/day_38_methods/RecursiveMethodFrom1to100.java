package day_38_methods;

public class RecursiveMethodFrom1to100 {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int num){
        System.out.print(num+ " ");
        num++;
        if(num <= 100) {
            printNum(num);
        }
    }
}
