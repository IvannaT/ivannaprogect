package day_47_contstrucrors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();//calling the constructor automatically
        cybertekAddress.setStreet("1652 25th NE #302");
        cybertekAddress.setCity("Issaquah");
        cybertekAddress.setState("WA");
        cybertekAddress.setZipCode("98029");
        System.out.println("cybertek school address " + cybertekAddress.toString());
        cybertekAddress.setCity("Bellevue");
        System.out.println("address update " + cybertekAddress);
        System.out.println("street info " + cybertekAddress.getStreet());

        Address newAddress = new Address();

        System.out.println(newAddress.toString());

        Address papaJon = new Address("12 Shychevicha st ","Rivne","RV","33016");
        System.out.println("papa john pizza "+ papaJon.toString());




    }
}
