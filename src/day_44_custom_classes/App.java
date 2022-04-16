package day_44_custom_classes;

/**
 * app class is using as a template for app objects
 * we are describing app properties and behavior here.Objects will be able to use them
 */
public class App {
    String name;//null by default
    double version;//0.0 be default

    public void open() {
        System.out.println("opening "+name+ " app version = " +version);

    }
}

