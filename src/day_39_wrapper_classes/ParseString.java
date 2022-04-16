package day_39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "123";
        int count = Integer.parseInt(total);
        System.out.println(total);

        String strPrices = "123.5";
        double price = Double.parseDouble(strPrices);
        if(price > 100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 100 lines of java";
        //split by space ,parse index 2 to int
       String[] words = sentence.split(" ");
       int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("lines of code = " + linesOfCode);


    }
}
