package replit_ptactice;

public class BreadJamBread {
    public static void main(String[] args) {
        String  word = "breadjambread";
        int index1 = word.indexOf("bread");            // 0
        int index2 = word.lastIndexOf("bread");    // 8
        if( index1 != index2){
            System.out.println(word.substring(5 , index2));
        }



    }
}
