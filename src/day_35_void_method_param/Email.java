package day_35_void_method_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {

      buildEmail("Nadir","Hisname");
      buildEmail("ivanna","novak");
    }
    public static void buildEmail(String name,String domain){
        name = name.replace(" ","-").toLowerCase(Locale.ROOT);
        domain = domain.toLowerCase(Locale.ROOT);
        String email = name +"@" + domain + ".com";


        System.out.println(email);

    }
}
