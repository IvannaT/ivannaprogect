package day_44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App uberApp = new App();//creating new object
        //opening Uber app - version= 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open();//call open method object variables (App class method)
        uberApp.version = 4.0;
        uberApp.open();


    }
}
