package day_46_encapsulation_oop;

public class DealershipCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        //setter method for model
       // public void setModel(String carModel){
           // model = carModel;
        //getter method for model
        //public String getModel() {
            //return model;
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = "+car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = "+ car1.getYear());

        car1.setMillage(88);
        System.out.println("car1 millage = "+ car1.getMillage());
        System.out.println(car1.toString());
        System.out.println(car1);//automatically calls toString

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Julia ");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMillage(16688);
        System.out.println("Model = " +alfaRomeo.getModel());
        System.out.println("Year = "+ alfaRomeo.getYear() );
        System.out.println("Mileage = "+ alfaRomeo.getMillage());
        System.out.println(alfaRomeo.toString());

    }
}
