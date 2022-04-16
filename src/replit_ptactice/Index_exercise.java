package replit_ptactice;

public class Index_exercise {
    public static void main(String[] args) {
        String str = "the game was tied at 2-2";
        String str2 = str.substring(5);
        System.out.println(str2);

        int index1 = str.indexOf("game");
        int index2 = str2.indexOf("game");
        System.out.println(index1);
        System.out.println(index2);

    }
}
