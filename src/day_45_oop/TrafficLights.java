package day_45_oop;

public class TrafficLights {
    String color;

    public void showColor() {
        System.out.println("current color = "+color);
    }
    public void changeColor(String newColor) {
        System.out.println("changing color to " + color);
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green")
                || newColor.equalsIgnoreCase("Yellow")) {
            color = newColor;
        }else{
            System.out.println("Error : invalid color = " + newColor);
        }
    }
}
