package day07_unary_operators_casting;

public class Store {
    public static void main(String[] args) {
        String store = "Target";
        int numberOfTvs = 100;
        System.out.println("Person comes into the stores and they bought a tv");
        System.out.println("Number of tvs now : " + -- numberOfTvs);
        System.out.println("Person comes into the stores and they bought a tv");
        System.out.println("Number of tvs now : " + -- numberOfTvs);
        System.out.println("Person comes into store and they put tv into their cart ");
        System.out.println("Number of tvs now : " + numberOfTvs--);
        System.out.println("Person comes into the stores and they bought a tv");
        System.out.println("Number of tvs now : " +  numberOfTvs);


    }
}
