package day05_primitives_concatanation;

public class CarInfo {
    public static void main(String[] args) {
        String carModel = "Infinity";
        String driverName = "Ivanna";
        String licenceNumber = "WE15267";
        byte speed = 70;
        boolean isAutomatic = true;
        char licenceClass = 'A';

        System.out.println("Car model: " +carModel);
        System.out.println(carModel+ " is car model.");
        System.out.println("Driver name : "+ driverName);
        System.out.println(driverName+" is driving a car"+ carModel);
        System.out.println("Current speed is " +speed +"mph");
        System.out.println("Licence Number : "+licenceNumber);
        System.out.println("is car automatic "  +isAutomatic);
        System.out.println(licenceClass + " - " + isAutomatic);


    }
}
