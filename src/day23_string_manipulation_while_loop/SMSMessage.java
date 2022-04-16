package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From number <+(222)333-444> Message:{Hello, lets code some java }";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring (start +1 , end));///???start +1
        String sender = message.substring(start +1 ,end );
        System.out.println("sender = " + sender);
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));// < +1 start to reed next indexn (umbers) < is point for
        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));//+1 move one step to the right
        System.out.println("text = " + text);





    }
}
