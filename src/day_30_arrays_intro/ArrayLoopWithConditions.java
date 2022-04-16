package day_30_arrays_intro;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {2.90, 23.4, 55.5, 43, 33.0, 99.9, 333.3, 434.43, 88.0, 123.77};
        String[] countries = {"Ukraine", "China", "USA", "France", "Germany", "OAE", "Italy", "Spain"};
        System.out.println("--------prices more than 100--------");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("\n----prices between 10 and 70 inclusive------");
        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.print(price + " ");
            }
        }
        System.out.println("\n-------count of the prices that are more than 50-----");
        int count =0;
        for (double each : prices) {
            if ( each  > 50.0) {
                count++;
            }
        }
        System.out.print("count = "  + count);

        System.out.println("\n-----countries with name length more than 6 - inclusive---");
        for(String country : countries){
            if(country.length() >= 7){
                System.out.print(country+" - "+ country.length()+" ");
            }
        }
    }
}

