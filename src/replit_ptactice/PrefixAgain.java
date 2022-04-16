package replit_ptactice;

public class PrefixAgain {
    public static void main(String[] args) {
        String word = "xnxwordxnxsport";
        int n = 3;
        String prefix = word.substring(0, n);
        String word2 = word.substring(n);
        if (word2.contains(prefix)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}