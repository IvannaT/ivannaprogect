package day15_logical_operotors_If_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = " Washington ";
        double salary = 120_000.0;
        Boolean isRemote = true;
        boolean benefits = true;

        if(location.equals("Washington") && salary >= 120_000.0 && isRemote && benefits ){
            System.out.println("Sure i will accept this offer ");
        }else {
            System.out.println("Consider another offer or negotiable");
        }

    }
}
