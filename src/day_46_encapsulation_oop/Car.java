package day_46_encapsulation_oop;
import java.util.*;
public class Car {
    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private int millage;
    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }
    public void setYear(int year){
       this.year = year;//this we don't need to create new variable
    }
    public int getYear(){
        return year;
    }
    public void setMillage(int millage){
        this.millage = millage;
    }
    public int getMillage() {
        return millage;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", millage=" + millage +
                '}';
    }

}
