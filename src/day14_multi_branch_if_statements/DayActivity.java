package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if(weather.equals("sunny")) {
            System.out.println( weather +"Go to park,hiking...");
        }else if(weather.equals("rainy")) {
            System.out.println( weather +"Stay home");
        }else if(weather.equals("snowy")) {
            System.out.println( weather +"Build a snowman");
        }else if(weather.equals("windy")) {
            System.out.println( weather + "Get ready for power loss");
        }else{
            System.out.println("keep codind java");
        }
    }
}
