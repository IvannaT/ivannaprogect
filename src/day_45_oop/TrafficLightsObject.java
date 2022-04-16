package day_45_oop;

public class TrafficLightsObject {
    public static void main(String[] args) {
        //create traffic light object
       TrafficLights trafficLights = new TrafficLights();
       //trafficLights.color = "red";
        //update the value of color using a method of the class/chaneColor from trafficLight class
        trafficLights.changeColor("red");
       // System.out.println(trafficLights.color);direct access
        //call method to access the variables
        trafficLights.showColor();
        trafficLights.changeColor("green");
        trafficLights.showColor();
        trafficLights.changeColor("yellow");
        trafficLights.showColor();

        TrafficLights trafficLights2 =new TrafficLights();
        trafficLights2.changeColor("black");
        trafficLights2.showColor();



    }
}
