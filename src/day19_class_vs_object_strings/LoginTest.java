package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String exUserName = "cybertek";
        String exPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";

        if(exUserName.equalsIgnoreCase(userName) && exPassword.equals(password)){
            System.out.println("Pass- user logged in succesfully " );
        }else{
            if(userName.equalsIgnoreCase(userName)){
                System.out.println("Fail - username is incorrect ");
            }else{
                System.out.println("Fail - password is incorrect");
            }
        }

    }
}
