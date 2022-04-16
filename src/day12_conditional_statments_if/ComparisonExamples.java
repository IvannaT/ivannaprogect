package day12_conditional_statments_if;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 45;

        //boolean isSpeeding
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding ? " + isSpeeding);
        System.out.println( "current Speed = " + currentSpeed);
        System.out.println("speed Limit = " + speedLimit + "mph");
        //45+20= 65
        currentSpeed +=20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding ? " + isSpeeding);
        System.out.println( "current Speed = " + currentSpeed);
        System.out.println("speed Limit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can I affort ? - " + (accountBalance >= itemPrice));
        boolean canAffort = accountBalance >= itemPrice;
        System.out.println("can affort = " + canAffort);

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke ?" + isBroke);





    }
}
