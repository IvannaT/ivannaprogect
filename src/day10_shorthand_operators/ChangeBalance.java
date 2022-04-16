package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1123.433;
        System.out.println("balance = " + balance);
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafe = 22.45;
        System.out.println("kenafa = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after kenafe = " + kenafe);
        kenafe = kenafe  / 2;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after second kenafe = " + kenafe);
        double plov= 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + plov);
        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);
        balance = balance - (iceTea * 4);
        System.out.println("balance after 4 Icetea = $"  + balance);
        //return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = $ " + balance);
    }
}
