package day_35_void_method_param;

public class VoidMethodsAtoZ {
    public static void main(String[] args) {
        printAtoZ();
        for (int i = 0; i < 3; i++) {
            printAtoZ();
        }
        displayUsFlag();
        displayUsFlag();
    }
    public static void printAtoZ(){
        for(char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    static public void displayUsFlag(){
        System.out.println("----Flag of USA------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
        System.out.println();
    }
}
