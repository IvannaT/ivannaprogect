package day_37_methods_overloading;

public class WarmUpMethods {
    public static void main(String[] args) {
        loginVoid("cybertekstudent", "abc123");
        loginVoid("cybertekstudent", "7273uyh");
        System.out.println(login("cybertekStudent","abc123"));

        if(login("cybertekStudent","abc123")) {
            System.out.println("Login successful");
        }else{
            System.out.println("login failed");
        }
        boolean isLoginSuccess = login("nadir","mountain");
        System.out.println("isLoginSuccess " +isLoginSuccess);
        if(login("nadir","mountain")){
            System.out.println("welcome");
        }else{
            System.out.println("wrong");
        }

    }

    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if (userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)) {
            System.out.println("login successful");
        } else {
            System.out.println("incorect");
        }
    }
    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if (userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)){
            return true;
        }
        return false;

    }
}