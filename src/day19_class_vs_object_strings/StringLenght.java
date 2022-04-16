package day19_class_vs_object_strings;

public class StringLenght {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count :" + word.length());
        System.out.println("wooden spoon ".length());
        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        if(password.length() >= 6) {
            System.out.println("Valid amazon password");
        }else{
            System.out.println("Password must be at least 6 characters");
        }
    }
}
