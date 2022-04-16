package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 12";
        String color = "blue";
        double price = 699.0;
        int storage = 256;

        int salary = 200000;
        double percent = salary * 0.15; //30000.0
        int perc = (int)percent;      //30000
        int salaryTwoYears = perc+salary; //230000 = 30000+200000
        System.out.println(percent);





        boolean hasCamera = true;
        System.out.println(brand);
        System.out.println(model);

        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Price is $ " + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? " + hasCamera);


    }

}
