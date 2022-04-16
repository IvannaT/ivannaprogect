package replit_ptactice;

public class PrintWithoutX {
    public static void main(String[] args) {
        String word = "xGoodx";
        noX(word);
    }
    public static void noX(String word){

        if(word.substring(0,1).equalsIgnoreCase("x")
               ||  word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        }
        else{
            System.out.println(word);
        }
    }

}
