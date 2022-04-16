package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {

        int toyota= 431;
        int honda = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;

        //int toyotas = 431; hondas = 233;vw = 2;tesla = 20;nissan = 1;

        int totalCarsInParking = toyota+honda+vw+tesla+nissan;
        System.out.println("There are " +totalCarsInParking + " cars in parking lot");

        /*create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
   /
         */

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        System.out.println("There are " +slicesPerPerson + " slices per person");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices," + people + " people ate " + slicesPerPerson + " per each" );




    }
}
