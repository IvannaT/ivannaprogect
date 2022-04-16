package day_46_encapsulation_oop;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(23455588505L);
        acc.setBalance(250.00);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 banking");
        System.out.println(acc.toString());


    }
}
