package ivanna_new_progect;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW
        if(player > 21){
            System.out.println("Player bust");
        }else{
            System.out.println("Players win");
        }






    }
}