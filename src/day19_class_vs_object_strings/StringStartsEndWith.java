package day19_class_vs_object_strings;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("inte"));
        System.out.println("java".startsWith("j"));
        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));
        String  name ="Ivanna";
        if(name.endsWith("a")){
            System.out.println("Maybe it is famale name");
        }
        String firstName = "Dr.Nadir";
        if(firstName.startsWith("Mr. ")){
            System.out.println("Man");
        }else if(firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if (firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");
        }
        String url = "www.amazon.com";
        if(url.endsWith(".com")){
            System.out.println("Commercial webcite");
        }else if(url.endsWith(".ua")){
            System.out.println("Ukranian webcite");
        }else if(url.endsWith("gov")){
            System.out.println("Goverment");
        }else if(url.endsWith(".edu")){
            System.out.println("Education webcite");
        }else if(url.endsWith(".org")) {
            System.out.println("Organization");

        }
}
}