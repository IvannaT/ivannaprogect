package replit_ptactice;

public class SplitSenteceEmail {
    public static void main(String[] args) {
        splitEmail("oleg.cetnar@gmail.com");

    }
    public static void splitEmail(String email){

     int index = email.indexOf('@');
        System.out.println(email.substring(0,index)+" "+email.substring(index+1));
        String email2 = email.replace('@','*');
        System.out.println(email2);













    }
}
