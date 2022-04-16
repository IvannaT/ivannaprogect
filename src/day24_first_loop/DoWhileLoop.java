package day24_first_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 10;
        do{
            System.out.println("counter = " + counter);//print counter anytime
            counter += 100;
        }while(counter <= 1000);




        int count = 50;
        do{
            System.out.println(count + " = count");
            count += 25;
        }while (count <= 300);
    }

}
