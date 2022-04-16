package day_34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
        displayMessage();
        for (int i = 1;i <=100; i++) {
            System.out.println( i+ " - ");
            displayMessage();
        }
    }
    public static void displayMessage() {
        System.out.println("Hello B26 Friends");
    }
}
