package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Paris";
        System.out.println(city.equals("Paris"));
        System.out.println(city.equals("paris"));
        System.out.println(city.equals("Paris "));
        System.out.println(city.equalsIgnoreCase("Paris"));
        System.out.println(city.equalsIgnoreCase("paris"));
        if (city.equals("Paris")){
             System.out.println("equals()true");
        }else{
            System.out.println("equals()false");
        }

    }
}
