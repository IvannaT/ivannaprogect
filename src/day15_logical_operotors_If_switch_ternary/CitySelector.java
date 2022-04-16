package day15_logical_operotors_If_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";

        if (city.equals("Tampa") || city.equals("Barcelona")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering city " + city);
        }


        String teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Its java class with " + teacher);
        } else {
            System.out.println("It is not java with " + teacher);
        }

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class " + teacher);
        }else{
            System.out.println("Some class with " + teacher);
        }


        String company = "NadirTech";
        double salary = 100.00;
        if(company.equals("Google") || (salary >= 100.00)){
            System.out.println("Accept offer  from :" + company);
        }else{
            System.out.println("Regecting offer from company : " + company);
        }
    }
}