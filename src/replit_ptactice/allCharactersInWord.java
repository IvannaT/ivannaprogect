package replit_ptactice;

public class allCharactersInWord {
    public static void main(String[] args) {
        String word = "xnxwordxnxsport";

        String unique = "";
        for (int i = 0; i < word.length(); i++) {
            if(!unique.contains(word.charAt(i)+"")){
                unique+=word.charAt(i)+"";
            }
        }

        String repeated = "";

        for (int i = 0; i <unique.length() ; i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                  count++;
                }
            }

            repeated += unique.charAt(i)+""+count;
        }
        System.out.println(repeated);
    }
}