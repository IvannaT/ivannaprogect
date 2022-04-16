package day24_first_loop;

public class YouTubeCatVideoSec {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World smallest cat -BBC");
        int seconds = 0;
        while(seconds <= 60){
            System.out.println("Watching YouTube at video second: " +seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching");


    }
}
