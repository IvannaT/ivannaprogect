package day07_unary_operators_casting;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Cheese";
        int numOfSlices = 10;
        int numOfPeople = 4;
        int slicePerPerson = numOfSlices / numOfPeople;
        int slicesLeftOver = numOfSlices % numOfPeople;
        String report = "We ordered " + typeOfPizza + "pizza with " + numOfSlices + " slices" + numOfPeople + " people ate " + slicePerPerson + " each with " + slicesLeftOver + " left over ";
        System.out.println(report);
    }
}
